//sensores de calor derecha a izquierda
#define s_t1 36
#define s_t2 34
#define s_t3 32
#define s_t4 30
#define s_t5 28


//ultrasonido
#define ultra_trig_at 24
#define ultra_echo_at 25

#define ultra_trig_ad 26
#define ultra_echo_ad 27

//sensores de color
#define lineaCen 2 //verde
#define lineaIzq1 4
#define lineaIzq2 3
#define lineaDer1 0
#define lineaDer2 1

//motores
#define enableA 9
#define adelanteA 7
#define atrasA 6
#define adelanteB 5
#define atrasB 4
#define enableB 3

//ventilador
#define apa 29
int velA = 50;
int velB = 55;
void setup() {
  pinMode(ultra_echo_at, INPUT);
  pinMode(ultra_echo_ad, INPUT);
  pinMode(s_t1, INPUT);
  pinMode(s_t2, INPUT);
  pinMode(s_t3, INPUT);
  pinMode(s_t4, INPUT);
  pinMode(s_t5, INPUT);
  pinMode(ultra_trig_at, OUTPUT);
  pinMode(ultra_trig_ad, OUTPUT);

  // pinMode(enableA,OUTPUT);
  pinMode(enableB, OUTPUT);
  pinMode (adelanteA, OUTPUT);
  pinMode (atrasA, OUTPUT);
  pinMode (adelanteB, OUTPUT);
  pinMode (atrasB, OUTPUT);
  pinMode (apa, OUTPUT);

  pinMode (lineaCen, INPUT);
  pinMode (lineaIzq1 , INPUT);
  pinMode (lineaIzq2, INPUT);
  pinMode (lineaDer1, INPUT);
  pinMode (lineaDer2, INPUT);

  Serial.begin(9600);

}

void loop() {
  int negro = analogRead(lineaCen);
  delay(200);
  arranque();
  while (!sensor()) {
    if (analogRead(lineaCen) >= (negro - 100) && analogRead(lineaCen) <= (negro + 100) ) {
      adelante();
    } else {
      apagar();
      atras();
      delay(100);
      apagar();
      delay(10);
      arranque();
      derecha();
      delay(200);
      apagar();
      delay(25);
    }

    if ( !(analogRead(lineaIzq1) >= (negro - 100) && analogRead(lineaIzq1) <= (negro + 100)) ) {

      atras();
      delay(200);
      apagar();
      delay(30);
      arranque();
      derecha();
      delay(200);
      apagar();
      delay(25);
    }

    if ( !(analogRead(lineaIzq2) >= (negro - 100) && analogRead(lineaIzq2) <= (negro + 100)) ) {

      atras();
      delay(200);
      apagar();
      delay(30);
      arranque();
      derecha();
      delay(200);
      apagar();
      delay(25);
    }

    if ( !(analogRead(lineaDer1) >= (negro - 100) && analogRead(lineaDer1) <= (negro + 100)) ) {

      atras();
      delay(200);
      apagar();
      delay(30);
      arranque();
      izquierda();
      delay(200);
      apagar();
      delay(25);
    }

    if ( !(analogRead(lineaDer2) >= (negro - 100) && analogRead(lineaDer2) <= (negro + 100)) ) {
      atras();
      delay(200);
      apagar();
      delay(30);
      arranque();
      izquierda();
      delay(200);
      apagar();
      delay(25);
    }
  }

     if((digitalRead(s_t1)==1||digitalRead(s_t2))&& digitalRead(s_t3)){
      digitalWrite(apa,1);
        izquierda();
        delay(100);
        adelante();
        while((digitalRead(s_t3)==1 && digitalRead(s_t4)==1 && digitalRead(s_t2)==1) || (digitalRead(s_t3)==1 && digitalRead(s_t4)==1) || (digitalRead(s_t4)==1 && digitalRead(s_t2)==1) ){
          apagar();
          digitalWrite(apa,1);
          delay(300);
          //digitalWrite(apa,0);
          adelante();
          delay(80);
        }
        apagar();
        digitalWrite(apa,0);

        //...
      }
  
       if((digitalRead(s_t1)==1||digitalRead(s_t2))&& !(digitalRead(s_t3) ==1)){
        digitalWrite(apa,1);
         izquierda();
          delay(100);
          adelante();
          while((digitalRead(s_t3)==1 && digitalRead(s_t4)==1 && digitalRead(s_t2)==1) || (digitalRead(s_t3)==1 && digitalRead(s_t4)==1) || (digitalRead(s_t4)==1 && digitalRead(s_t2)==1) ){
            apagar();
            digitalWrite(apa,1);
            delay(300);
            //digitalWrite(apa,0);
            adelante();
            delay(80);
          }
          apagar();
          digitalWrite(apa,0);

          //...     }
    
       }
  
     if((digitalRead(s_t4)==1||digitalRead(s_t5))&& (digitalRead(s_t3) ==1) ){
      digitalWrite(apa,1);
          derecha();
          delay(100);
          adelante();
          while((digitalRead(s_t3)==1 && digitalRead(s_t4)==1 && digitalRead(s_t2)==1) || (digitalRead(s_t3)==1 && digitalRead(s_t4)==1) || (digitalRead(s_t4)==1 && digitalRead(s_t2)==1) ){
            apagar();
            digitalWrite(apa,1);
            delay(300);
            //digitalWrite(apa,0);
            adelante();
            delay(80);
          }
          apagar();
          digitalWrite(apa,0);
  
      }
  
     if((digitalRead(s_t4)==1||digitalRead(s_t5))&& !(digitalRead(s_t3) ==1) ){
        //...
         digitalWrite(apa,1);
         derecha();
          delay(100);
          adelante();
          while((digitalRead(s_t3)==1 && digitalRead(s_t4)==1 && digitalRead(s_t2)==1) || (digitalRead(s_t3)==1 && digitalRead(s_t4)==1) || (digitalRead(s_t4)==1 && digitalRead(s_t2)==1) ){
            apagar();
            digitalWrite(apa,1);
            delay(300);
            //digitalWrite(apa,0);
            adelante();
            delay(80);
          }
          apagar();
          digitalWrite(apa,0);

          //...     }
    
  
      }
}

bool sensor() {

  if (digitalRead(s_t1) == 1) {
    return true;
  }
  if (digitalRead(s_t2) == 1) {
    return true;
  }
  if (digitalRead(s_t3) == 1) {
    return true;
  }
  if (digitalRead(s_t4) == 1) {
    return true;
  }
  if (digitalRead(s_t5) == 1) {
    return true;
  }
  return false;
}

void adelante() {
  analogWrite(enableA, velA);
  digitalWrite(adelanteA, 1);
  analogWrite(enableB, velB);
  digitalWrite(adelanteB, 1);
}

void atras() {
  analogWrite(enableA, 70);
  digitalWrite(atrasA, 1);
  analogWrite(enableB,  77);
  digitalWrite(atrasB, 1);
  delay(100);
}

void derecha() {
  analogWrite(enableA, velA);
  digitalWrite(adelanteA, 1);
  analogWrite(enableB, 0);
  digitalWrite(adelanteB, 0);
}

void izquierda() {
  analogWrite(enableA, 0);
  digitalWrite(adelanteA, 0);
  analogWrite(enableB, velB);
  digitalWrite(adelanteB, 1);
}

void apagar() {
  analogWrite(enableA, 0);
  digitalWrite(adelanteA, 0);
  analogWrite(enableB, 0);
  digitalWrite(adelanteB, 0);
  digitalWrite(atrasA, 0);
  digitalWrite(atrasB, 0);
}

void arranque() {
  analogWrite(enableA, 70);
  digitalWrite(adelanteA, 1);
  analogWrite(enableB, 77);
  digitalWrite(adelanteB, 1);
  delay(100);
}

void apagarVelas() {

}
