abstract class AbstractGameState {
    public abstract fun enterState(manager: GameStateManager)
    public abstract fun updateState(manager: GameStateManager)
}