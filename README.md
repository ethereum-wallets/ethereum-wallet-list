# What is it?

It is a collection of data about multiple wallets. So users can easily compare them and libraries can resolve wallets matching certain constraints for users.

# Mandatory fields
## Common

 * name - (max 10 characters)
 * short description - (max 80 characters)
 * icon - file that exists in images/128x128 and images/large

## Android

 * package-name (must be found with this package-name on all distributions)# What is it?

It is a collection of data about multiple wallets. So users can easily compare them and libraries can resolve wallets matching certain constraints for users.

# Mandatory fields
## Common

 * name - (max 10 characters)
 * short description - (max 80 characters)
 * icon - file that exists in images/128x128 and images/large

## Android

 * package_name (must be found with this package-name on all distributions)
 * version_code (positive number - most recent version code - needed so if feature was introduced in a version - then libraries can know if the current version supports this feature or should redirect to the store for an update)
 * distributions - list of (PLAY, FDROID, VIVO, OPPO, XIAOMI, QQ)

# Optional fields

 * long_description_file (if existing the file must exist in txt/en at least)
 * support_email
 * license
 * root_commit
 * github (link to github repo - e.g. https://github.com/walleth/walleth),
 * mnemonic_import boolean
 * networks list of (main, rinkeby, kovan, ropsten)
 * multisig - boolean
 * erc20 - boolean
 * custom_erc20 - boolean if user can add own ERC20 definitions (decimals, ..)
 * mnemonic_export - boolean
 * dapp_browser - boolean
 * had_ico  - boolean
 * erc-681  - boolean
 * erc-67  - boolean
 * ethereum_signed_message  - boolean
 * long_description_file  - boolean
 * website - string
 * peepet - string - e.g. walleth,
 * twitter - string wallethapp
 * trezor_support  - boolean
 * leger_support  - boolean
 
# Context

 * [ethereum-magicians workshop notes](https://ethereum-magicians.org/t/notes-fom-the-wallet-workshop-at-web3-ux-unconference-in-berlin/1292) containing action item to create this project

# License

MIT
 * version code (most recent version code - needed so if 
 * distributions - list of (PLAY, FDROID, VIVO, OPPO, XIAOMI, QQ)

# Optional fields

 * long_description_file (if existing the file must exist in txt/en at least)
 * support_email
 * license
 * root_commit
 * github (link to github repo - e.g. https://github.com/walleth/walleth),
 * mnemonic_import boolean
 * networks list of (main, rinkeby, kovan, ropsten)
 * multisig - boolean
 * erc20 - boolean
 * custom_erc20 - boolean if user can add own ERC20 definitions (decimals, ..)
 * mnemonic_export - boolean
 * dapp_browser - boolean
 * had_ico  - boolean
 * erc-681  - boolean
 * erc-67  - boolean
 * ethereum_signed_message  - boolean
 * long_description_file  - boolean
 * website - string
 * peepet - string - e.g. walleth,
 * twitter - string wallethapp
 * trezor_support  - boolean
 * leger_support  - boolean
 
# Context

 * [ethereum-magicians workshop notes](https://ethereum-magicians.org/t/notes-fom-the-wallet-workshop-at-web3-ux-unconference-in-berlin/1292) containing action item to create this project

# License

MIT
