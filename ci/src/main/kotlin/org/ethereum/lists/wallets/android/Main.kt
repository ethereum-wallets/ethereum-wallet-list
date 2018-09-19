package org.ethereum.lists.wallets.android

import com.squareup.moshi.Moshi
import org.ethereum.wallets.android.model.AndroidWallet
import java.io.File
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val moshi = Moshi.Builder().build()
    val rootPath = File("..")
    File(rootPath, "android").listFiles().filter { !it.name.endsWith("~") }.forEach {
        println("processing: " + it.name)
        val adapter = moshi.adapter(AndroidWallet::class.java)
        val wallet = adapter.fromJson(it.readText())!!

        val walletName = wallet.name ?: error("needs to contain name")

        if (walletName.length > 10) {
            error("name too long - max 10 chars")
        }

        val package_name = wallet.package_name ?: error("needs to contain package name")
        if (!package_name.contains(".")) {
            error("package name needs to contain a dot")
        }

        val shortDescription = wallet.short_description ?: error("needs short_description")

        if (shortDescription.length > 80) {
            error("short_description cannot be longer than 80 chars")
        }

        if (wallet.icon == null) {
            error("needs icon")
        }

        if (!File(rootPath, "images/128x128/" + wallet.icon).exists()) {
            error("needs icon " + wallet.icon + " to exist in images/128x128")
        }

        if (!File(rootPath, "images/large/" + wallet.icon).exists()) {
            error("needs icon " + wallet.icon + " to exist in images/large")
        }

        wallet.long_description_file?.let {
            if (!File(rootPath, "text/$it").exists()) {
                error("long_description_file text/$it must exist")
            }
        }
    }
}

fun error(message: String): Nothing {
    println("error:$message")
    exitProcess(1)
}
