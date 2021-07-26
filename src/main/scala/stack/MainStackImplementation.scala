package stack

object MainStackImplementation {
  def main(args:Array[String]) {
    var stk = new StackImplementation[Int];
    stk.pushImp(12);
    stk.pushImp(13);
    stk.pushImp(14);
    stk.traverseImp();
    stk.popImp();
    stk.traverseImp();
    stk.popImp();

  }
}