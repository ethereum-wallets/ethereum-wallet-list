package org.ethereum.wallets.android.model

data class AndroidWallet(
        val name: String?,
        val package_name: String?,
        val distribution: List<Distribution>?,
        val icon: String?,
        val short_description: String?,
        val long_description_file: String?,
        val networks: List<String>?
)