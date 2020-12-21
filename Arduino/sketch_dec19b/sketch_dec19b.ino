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


void loop()
{
  unsigned long value;
  unsigned long lastValue;

  center_servos();  // Center all servos
  high = 15;        // Set hight to 15
  spd = 3;          // Set speed to 3

  while (1 == 0)    // Loop forever
  {
    if (irrecv.decode(&results)) // If we have received an IR signal
    {
      value = results.value;

      if (value == irRepeat)
        value = lastValue;

      switch (value)
      {
        /*case irUp:
          lastValue = irUp;
          forward();
          break;

        case irDown:
          lastValue = irDown;
          back();
          break;

        case irRight:
          lastValue = irRight;
          turn_right();
          break;

        case irLeft:
          lastValue = irLeft;
          turn_left();
          break;

        case irOK:
          lastValue = irOK;
          break;

        case ir1:
          lastValue = ir1;
          bow();
          break;

        case ir2:
          lastValue = ir2;
          wave();
          break;

        case ir3:
          lastValue = ir3;
          increase_speed();
          break;

        case ir4:
          lastValue = ir4;
          break;

        case ir5:
          lastValue = ir5;
          break;

        case ir6:
          lastValue = ir6;
          decrease_speed();
          break;

        case ir7:
          lastValue = ir7;
          break;

        case ir8:
          lastValue = ir8;
          dance();
          break;

        case ir9:
          lastValue = ir9;
          break;

        case ir0:
          lastValue = ir0;
          center_servos();
          break;

        case irStar:
          lastValue = irStar;
          trim_left();
          break;
      */
        case left:
          lastValue = left;
          go_left();
          break;

        default:
          break;
      }

      irrecv.resume(); //next value
      delay(50);  // Pause for 50ms before executing next movement

    }// if irrecv.decode
  }//while


  void go_Left() {

    //=====first_movement======//
    leg_front_left.write(100);
    delay(20);
    pre_leg_front_left.write(120);
    delay(20);
    leg_front_left.write(40);
    delay(20);

    //====second_movement======//
    leg_back_rigth.write(100);
    delay(20);
    pre_leg_back_right.write(40);
    delay(20);
    leg_back_rigth.write(40);
    delay(20);

    //=====third_movement=====//
  /*
    leg_front_right.write();

    pre_leg_front_right.write();
    leg_back_left.write();

    pre_leg_back_left.write();
    */

  }

  void central() {

    leg_front_left.write(90);
    leg_front_right.write(90);
    pre_leg_front_left.write(90);
    pre_leg_front_right.write(90);
    leg_back_left.write(90);
    leg_back_rigth.write(90);
    pre_leg_back_left.write(90);
    pre_leg_back_right.write(90);
    delay(500);
  }

}

