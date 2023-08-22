
class MicrowaveController extends Observer {

  private val button: Button = new Button()
  button.addObserver(this)
  private val heater: Heater = new Heater()
  heater.addObserver(this)
  private val door: Door = new Door()
  door.addObserver(this)

  private var light: Boolean = false

  override def update(component: Component): Unit = {

    if (component.componentType == ComponentType.Button) {
      if (door.getState) {
        println("Door is open so noting happens")
      }
      else {
        println("door is closed so increace heater timer by 1")
      }
    }

    if (component.componentType == ComponentType.Door && component.state) {
      light = true
      println("door opened so light is on")
      if (heater.getState) {
        heater.change()
        println("door opened and heater was running so heater stopped running")
      }
    }
    if (component.componentType == ComponentType.Door && !component.state) {
      light = false
      println("door clossing so light is off")
    }
  }

  def pressButton(): Unit = {
    button.press()
  }

  def changeHeaterState(): Unit = {
    heater.change()
  }

  def changeDoorState(): Unit = {
    door.change()
  }
}
