public class Main {
    public static void main(String[] args) {
      double lat1,lat2,lat3,lat4, lat5,
              long1, long2, long3, long4, long5,long6,
                  latitude, longitude;
      Boolean poslat1, poslat2, poslat3, poslat4, poslat5,
              poslong1, poslong2, poslong3, poslong4, poslong5,poslong6;
      Boolean posk1confirm, posk2confirm, posk10confirm,
              posk3confirm, posk6confirm, posk9confirm, posk11confirm,
                  posk4confirm, posk7confirm,posk12confirm;
      String unavailable;
      
      unavailable = "Unavailable";
          //////////////////////
          lat1 = -7.7283160;
          lat2 = -7.7283155;
          lat3 = -7.7283145;
          lat4 = -7.7283110;
          lat5 = -7.7283100;
  
          long1 = 110.4109377;
          long2 = 110.4109404;
          long3 = 110.4109420;
          long4 = 110.4109444;
          long5 = 110.4109471;
          //////// long kursi 1 ////////////
          /// long kursi a = total long ///
          // yaitu long 5 /////////////////
          long6 = 110.4109471;
          
          
          latitude = -7.7283161;
          longitude = 110.4109415;
          
          
              
              poslong1 = false;
              poslong2 = false;
              poslong3 = false;
              poslong4 = false;
              poslong5 = false;
              poslong6 = false;
              poslat1 = false;
              poslat2 = false;
              poslat3 = false;
              poslat4 = false;
              poslat5 = false;
              posk1confirm = false;
              posk2confirm = false;
              posk3confirm = false;
              posk4confirm = false;
              posk6confirm = false;
              posk7confirm = false;
              posk9confirm = false;
              posk10confirm = false;
              posk11confirm = false;
              posk12confirm = false;
              ///kursi 1 // 
  
              
              ///// kursi 2 3 4 ////
              if (longitude > long1 && longitude < long2){
                  if (latitude > lat2 && latitude < lat3){
                      posk2confirm = true;
                      poslat3 = true;
                  }
                  else if (latitude > lat3 && latitude < lat4){
                      posk3confirm = true;
                      poslat4 = true;
                  }
                  else if (latitude > lat4 && latitude < lat5){
                      posk4confirm = true;
                      poslat5 = true;
                  }
                  else {
                      posk2confirm = false;
                      posk3confirm = false;
                      posk4confirm = false;
                      poslat3 = false;
                      poslat4 = false;
                      poslat5 = false;
                  }
                  //poslong2 = true;
              }
              ///// kursi 6 7 ////
              else if (longitude > long2 && longitude < long3)  {
                  
                  if (latitude > lat2 && latitude < lat4){
                      posk6confirm = true;
                      poslat4 = true;
                  }
                  else if (latitude > lat4 && latitude < lat5) {
                      posk7confirm = true;
                      poslat5 = true;
                  }
                  else {
                      posk6confirm = false;
                      posk7confirm = false;
                      poslat4 = false;
                      poslat5 = false;
                  }
                  poslong3 = true;
              }
              //// kursi 9 /// 
              else if (longitude > long3 && longitude < long4){
                  
                  if (latitude > lat2 && latitude < lat4){
                      posk9confirm = true;
                      poslat4 = true;
                  }
                  else{
                      posk9confirm = false;
                      poslat4 = false;
                  }
                  poslong4 = true;
              }
              //// kursi 10 11 12 //
              else if (longitude > long4 && longitude < long5){
                  
                  if (latitude > lat2 && latitude < lat3){
                      posk10confirm = true;
                      poslat3 = true;
                  }
                  else if (latitude > lat3 && latitude < lat4){
                      posk11confirm = true;
                      poslat4 = true;
                  }
                  else if (latitude > lat4 && latitude < lat5){
                      posk12confirm = true;
                      poslat5 = true;
                  }
                  else {
                      posk10confirm = false;
                      posk11confirm = false;
                      posk12confirm = false;
                      poslat3 = false;
                      poslat4 = false;
                      poslat5 = false;
                  }
                  poslong5 = true;
              }
              /// kursi 1//
              else if (longitude > long2 && longitude < long4){
                  if (latitude > lat1 && latitude < lat2){
                      posk1confirm = true;
                      poslat1 = true;
                  }
                  else{
                      posk1confirm = false;
                      poslat1 = false;
                  }
                  poslong4 = true;
              }
              else {
              poslong1 = false;
              poslong2 = false;
              poslong3 = false;
              poslong4 = false;
              poslong5 = false;
              poslong6 = false;
              poslat1 = false;
              poslat2 = false;
              poslat3 = false;
              poslat4 = false;
              poslat5 = false;
              posk1confirm = false;
              posk2confirm = false;
              posk3confirm = false;
              posk4confirm = false;
              posk6confirm = false;
              posk7confirm = false;
              posk9confirm = false;
              posk10confirm = false;
              posk11confirm = false;
              posk12confirm = false;
              }
              
              /* System.out.println(posk1confirm);
              System.out.println(posk2confirm);
              System.out.println(posk3confirm);
              System.out.println(posk4confirm);
              System.out.println(posk6confirm);
              System.out.println(posk7confirm);
              System.out.println(posk9confirm);
              System.out.println(posk10confirm);
              System.out.println(posk11confirm);
              System.out.println(posk12confirm);
              */
  
  
  
  
  
  
  
          if (posk1confirm) {
              System.out.println("kursi 1");
              System.out.println(posk1confirm);
              System.out.println(poslat1);
              System.out.println(poslong6);
          }
          else if (posk2confirm) {
              System.out.println("kursi 2");
              System.out.println(posk2confirm);
              System.out.println(poslat3);
              System.out.println(poslong2);
          }
          else if (posk3confirm) {
              System.out.println("kursi 3");
              System.out.println(posk3confirm);
              System.out.println(poslat4);
              System.out.println(poslong2);
          }
          else if (posk4confirm) {
              System.out.println("kursi 4");
              System.out.println(posk4confirm);
              System.out.println(poslat5);
              System.out.println(poslong2);
          }
          else if (posk6confirm) {
              System.out.println("kursi 6");
              System.out.println(posk6confirm);
              System.out.println(poslat4);
              System.out.println(poslong3);
          }
          else if (posk7confirm) {
              System.out.println("kursi 7");
              System.out.println(posk7confirm);
              System.out.println(poslat5);
              System.out.println(poslong3);
          }
          else if (posk9confirm) {
              System.out.println("kursi 9");
              System.out.println(posk9confirm);
              System.out.println(poslat4);
              System.out.println(poslong4);
          }
          else if (posk10confirm) {
              System.out.println("kursi 10");
              System.out.println(posk10confirm);
              System.out.println(poslat3);
              System.out.println(poslong5);
          }
          else if (posk11confirm) {
              System.out.println("kursi 11");
              System.out.println(posk11confirm);
              System.out.println(poslat4);
              System.out.println(poslong5);
          }
          else if (posk12confirm) {
              System.out.println("kursi 12");
              System.out.println(posk12confirm);
              System.out.println(poslat5);
              System.out.println(poslong5);
          }
          else {
              System.out.println("unavailable");
              System.out.println(unavailable);
              System.out.println(unavailable);
              System.out.println(unavailable);
          }
    }
  }
  