//=============Library======================//

#include <IRremote.h> // include IR Remote library
#include <Servo>    // include servo library

//==========IR Remote Button Codes===========//

#define up  16736925
#define Down 16754775
#define Right 16761405
#define Left 16720605
#define centralize 16712445
#define btn1 16738455
#define btn2 16750695
#define btn3 16756815
#define btn4 16724175
#define btn5 16718055
#define btn6 16743045
#define btn7 16716015
#define btn8 16726215
#define btn9 16734885
#define btn0 16730805
#define Star 16728765
#define Pound 16732845
#define irRepeat 4294967295

//=====Speed======//

int spd  = 3;

//===high robot standing=====//

int high = 0;

//========Define OBJ Servo==========//

Servo leg_front_left;
Servo leg_front_right;
Servo pre_leg_front_left;
Servo pre_leg_front_right;
Servo leg_back_left;
Servo leg_back_rigth;
Servo pre_leg_back_left;
Servo pre_leg_back_right;

//===========Set up IR Sensor============//

int irReceiver = 12;       // Use pin 12
IRrecv irrecv(irReceiver); //new instance
decode_results results;



void setup()
{

//=========servos Pins==============//

  leg_front_left.attach(0);
  leg_front_right.attach(2);
  pre_leg_front_left.attach(1);
  pre_leg_front_right.attach(3);
  leg_back_left.attach(4);
  leg_back_rigth.attach(6);
  pre_leg_back_left.attach(5);
  pre_leg_back_right.attach(7);

  irrecv.enableIRIn(); //start the receiver

  Serial.begin (9600);

}


void go_Left(){

  leg_front_left.write();
  leg_front_right.write();
  pre_leg_front_left.write();
  pre_leg_front_right.write();
  leg_back_left.write();
  leg_back_rigth.write();
  pre_leg_back_left.write();
  pre_leg_back_right.write();
  
}
