class Dice {
    var diceName: String
        private set
        var sides: Int
        var sideUp = 0
        private set

    // Default Constructor
    //
    constructor() {
        sides = 6
        diceName = "d6"
        roll()
    }

    // Constructor with one argument ie. Sides
    //
    constructor(sides: Int) {
        this.sides = sides
        diceName = getDiceNameFor(sides)
        roll()
    }

    // Constructor with two argument ie. Sides and Name
    //
    constructor(sides: Int, diceName: String) {
        this.sides = sides
        this.diceName = diceName
        roll()
    }

    // This method rolls the dice and set a random number to side up
    //
    fun roll() {
        val roundRandom = Math.round(Math.random() * 10).toInt()
        if (roundRandom == 0) {
            sideUp = 1
        } else {
            sideUp = Math.round((roundRandom * sides / 10).toFloat())
        }
    }

    // Getters or Accessors
    //
    fun getSides(): Int {
        return sides
    }

    // Setters or Mutators
    //
    fun setSides(sides: Int) {
        this.sides = sides
        diceName = getDiceNameFor(sides)
    }

    fun setName(diceName: String) {
        this.diceName = diceName
    }

    private fun getDiceNameFor(sides: Int): String {
        return "d" + sides.also { diceName = it.toString() }
    }

    // Get highest value
    //
    fun showHighestValue() {
        println("Highest value of dice: " + sides)
    }
}