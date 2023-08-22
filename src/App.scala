object App extends App {

  private val controller = new MicrowaveController
// begin state: light uit, heater uit, deurr gesloten


  controller.changeDoorState()
  controller.pressButton()








}
