package homework_8.Davit_Poghosyan.Chapter_9.Interface;

 class Client implements Callback{
  public void callback(int p){
   System.out.println("callback called with " + p);
  }
  void nonIfaceMeth(){
   System.out.println("Classes that implement interface " + "may also define other members, too");
  }
}
