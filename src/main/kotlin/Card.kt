class Card(val color: Char, val value: Int) {
    /*
    color:
    * ♠-p
    * ♣-t
    * ♥-s
    * ♦-k
     value:
     2
     3
     4
     5
     6
     7
     8
     9
     10
     J->11
     Q->12
     K->13
     A->14
     */
    override fun toString(): String {
        return "Color $color and value of $value"
    }

}