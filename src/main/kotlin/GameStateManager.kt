class GameStateManager{
    lateinit var gameState : AbstractGameState
    val podjela:StatePodjela = StatePodjela()
    val ulaganje:StateUlaganje = StateUlaganje()
    val turn : StateTurn = StateTurn()
    val flop : StateFlop = StateFlop()
    val river : StateRiver = StateRiver()
    val usporedba:StateUsporedba = StateUsporedba()
    val kraj :StateKraj = StateKraj()
    var deck = listOf<Card>(Card('p',2),
    Card('p',3),
    Card('p',4),
    Card('p',5),
    Card('p',6),
    Card('p',7),
    Card('p',8),
    Card('p',9),
    Card('p',11),
    Card('p',12),
    Card('p',13),
    Card('p',14),
    Card('t',2),
    Card('t',3),
    Card('t',4),
    Card('t',5),
    Card('t',6),
    Card('t',7),
    Card('t',8),
    Card('t',9),
    Card('t',11),
    Card('t',12),
    Card('t',13),
    Card('t',14),
    Card('k',2),
    Card('k',3),
    Card('k',4),
    Card('k',5),
    Card('k',6),
    Card('k',7),
    Card('k',8),
    Card('k',9),
    Card('k',11),
    Card('k',12),
    Card('k',13),
    Card('k',14),
    Card('s',2),
    Card('s',3),
    Card('s',4),
    Card('s',5),
    Card('s',6),
    Card('s',7),
    Card('s',8),
    Card('s',9),
    Card('s',11),
    Card('s',12),
    Card('s',13),
    Card('s',14))
    var players= mutableListOf<Player>()
    var gameOngoing:Boolean = false
    var turnCounter:Int=0
    var baseUlog:Int = 10


    fun start(){
        gameOngoing=true
        gameState = podjela
        gameState.enterState(this)
    }
    fun update(){
        while (gameOngoing){
            gameState.updateState(this)
        }
    }
    fun swichGameState(newState:AbstractGameState){
        gameState=newState
        gameState.enterState(this)
    }

    private fun playerInit(){}
}