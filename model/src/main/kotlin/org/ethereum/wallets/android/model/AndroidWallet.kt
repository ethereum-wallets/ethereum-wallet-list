package org.ethereum.wallets.android.model

data class AndroidWallet(
        val name: String?,
        val package_name: String?,
        val version_code: Int?,
        val distribution: List<Distribution>?,
        val icon: String?,
        val short_description: String?,
        val long_description_file: String?,
        val networks: List<String>?,

        val multisig: Boolean,

        val mnemonic_export: Boolean,
        val dapp_browser: Boolean,
        val had_ico: Boolean,

        val erc20: Boolean,
        val erc67: Boolean,
        val erc681: Boolean,

        val custom_erc20: Boolean,

        val ethereum_signed_message: Boolean,
        val trezor_support: Boolean,
        val leger_support: Boolean,

        val website: String,
        val peepeth: String,
        val twitter: String

)