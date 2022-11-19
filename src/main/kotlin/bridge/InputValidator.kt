package bridge

object InputValidator {

    fun validateBridgeInput(bridgeSize: String) {
        validateNumericInput(bridgeSize)
        validateBridgeSize(bridgeSize.toInt())
    }

    private fun validateBridgeSize(bridgeSize: Int) =
        require(bridgeSize in 3..20) {
            println(Error.BRIDGE_RANGE_ERROR.errorMessage)
        }

    private fun validateNumericInput(input: String) {
        require(input.isNumeric()) {
            println(Error.NUMERIC_ERROR.errorMessage)
        }
    }


    private fun String.isNumeric() =
        this.chars().allMatch { eachChar -> Character.isDigit(eachChar) }

}