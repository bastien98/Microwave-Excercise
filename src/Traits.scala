trait Observable {
  private var observers: Seq[Observer] = Seq()

  def addObserver(o: Observer): Unit = observers = observers :+ o

  def notifyObservers(state: Component): Unit = observers.foreach(_.update(state))
}

trait Observer {
  def update(state: Component): Unit
}
