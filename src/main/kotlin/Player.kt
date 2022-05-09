class Player(val name:String) {
    var cards:List<Card> = mutableListOf()
    var bank = 10000
    var state :PlayerState = PlayerState.player
    var ulog : Int = 0
    var ulozio:Boolean=false
}