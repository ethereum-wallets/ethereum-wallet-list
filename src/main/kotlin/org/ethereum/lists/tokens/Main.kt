package org.ethereum.lists.tokens

import com.squareup.moshi.Moshi
import java.io.File
import kotlin.system.exitProcess

enum class Distribution {
    PLAY,
    FDROID
}

data class AndroidWallet(
        val name: String?,
        val package_name: String?,
        val distribution: List<Distribution>?,
        val icon: String?,
        val short_description: String?,
        val long_description_file: String?,
        val networks: List<String>?
)

fun main(args: Array<String>) {
    val moshi = Moshi.Builder().build()
    File("android").listFiles().filter { !it.name.endsWith("~") }.forEach {
        println("processing: " + it.name)
        val adapter = moshi.adapter(AndroidWallet::class.java)
        val wallet = adapter.fromJson(it.readText())!!

        if (wallet.name == null) {
            error("needs to contain name")
        }

        if (wallet.name.length > 10) {
            error("name too long - max 10 chars")
        }

        if (wallet.package_name == null) {
            error("needs to contain package name")
        }
        if (!wallet.package_name.contains(".")) {
            error("package name needs to contain a dot")
        }

        if (wallet.short_description == null) {
            error("needs short_description")
        }

        if (wallet.short_description.length > 80) {
            error("short_description cannot be longer than 80 chars")
        }

        if (wallet.icon == null) {
            error("needs icon")
        }

        if (!File("images/128x128/" + wallet.icon).exists()) {
            error("needs icon " + wallet.icon + " to exist in images/128x128")
        }

        if (!File("images/large/" + wallet.icon).exists()) {
            error("needs icon " + wallet.icon + " to exist in images/large")
        }

        wallet.long_description_file?.let {
            if (!File("text/$it").exists()) {
                error("long_description_file text/$it must exist")
            }
        }
    }
}

fun error(message: String): Nothing {
    println("error:$message")
    exitProcess(1)
}
