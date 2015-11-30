//Made by David Marques

Ball Hi1;
Ball Hi2;
Ball Hi3;
Ball Hi4;
Ball Hi5;
//float wallX = 400;
String Help = "W to take away wall /n 1, 2, and 3 to reset corresponding balls \n R to reset everything. \n M to toggle Mouse \n P to set pool table to Pink \n H to hide the help";

boolean wall;
float tableR, tableL, tableT, tableB;      //pool table coordinates

float wallR, wallL, wallT, wallB;
float wallWidth;

float poolR,poolG,poolB;
boolean help;

void setup(){
  size(700,500);
  rectMode(CORNERS);
  tableR=width-20;
  tableL=20;        
  tableT=height/4;
  tableB=height-20;
  
  wallWidth=40;
  wallR=width/2+wallWidth;
  wallL=width/2-wallWidth;
  wallT=tableT;
  wallB=tableB;
  wall=true;
  //Ball( float Top, float Bottom, float Right, float Left )
  Hi1 = new Ball(wallR,tableT,tableR,tableB);
  Hi2 = new Ball(wallR,tableT,tableR,tableB);
  Hi3 = new Ball(wallR,tableT,tableR,tableB);
  Hi4 = new Ball(wallR,tableT,tableR,tableB);
  Hi5 = new Ball(wallR,tableT,tableR,tableB);
  
  
  poolR = 29;
  poolG = 191;
  poolB = 41;
  
  help = true;
  
  Hi1.borders(tableL,tableR,tableT,tableB,wallR);
  Hi2.borders(tableL,tableR,tableT,tableB,wallR);
  Hi3.borders(tableL,tableR,tableT,tableB,wallR);
  Hi4.borders(tableL,tableR,tableT,tableB,wallR);
  Hi5.borders(tableL,tableR,tableT,tableB,wallR);
}

void draw(){
  background(100,100,100);
  scene();
  wallShape();
  Hi1.display(1);
  Hi2.display(2);
  Hi3.display(3);
  Hi4.display(4);
  Hi5.display(5);
  
  Hi1.collisions(wall);
  Hi2.collisions(wall);
  Hi3.collisions(wall);
  Hi4.collisions(wall);
  Hi5.collisions(wall);
  
 
  
  
  Hi1.movement();
  Hi2.movement();
  Hi3.movement();
  Hi4.movement();
  Hi5.movement();
  
 
}

void scene() {
  noStroke();
  background(#F5BC1E);

  fill(#8E620A);
  rect(tableL-10, tableT-10, tableR+10, tableB+10); //Rim
  fill(poolR,poolG,poolB);
  rect(tableL, tableT, tableR, tableB);             //Table



  stroke(0);    //reset things back to default
  fill(255);
  if(help == false){
    text("Press H for Help and Buttons",10,10);
  } else {
    text(Help,10,10);
  }
}

void wallShape(){
  if(wall == true){
    fill(#16DBD6);
    rect(wallL,wallT,wallR,wallB);
  }
}

//// HANDLERS:  keys, click
void keyPressed() {
  
  //getting rid of the wall
  if (key == 'w' || key == 'W')  wall = false;
  
  //resetting to default settings
  if (key == 'r' || key == 'R')  //reset();
   
  if (key == 'p' || key == 'P') { //changing pool table color to pink
    poolR = 240;
    poolG = 19;
    poolB = 159;
  }
  
  //toggle for the mouse
  //if (key == 'm' || key == 'M')  ratDisplay = ! ratDisplay;
  
  ///Ball resets
 /* if (key == '1') resetBall1();
  if (key == '2') resetBall2();
  if (key == '3') resetBall3();
 */
  if (key == 'h' || key == 'H') help = !help;
  
}

//reset functions for mouse press


/*
float ratX, ratY;
boolean ratDisplay;
float temp;
void reset() {
  ratX=1;
  ratY=height - 50;
  ratDisplay = false;
  //random values when reset
  resetBall1();
  resetBall2();
  resetBall3();
}
//// SETUP:  size and table
void setup() {
  reset();
}

// Draw function bringing it all together
void draw() {
  rat(); 
}

void rat(){
  fill(255);
  ratX+=4;
  if(ratDisplay == true){
    if(frameCount % 30 > 15){
      triangle(ratX,ratY,ratX-20,ratY,ratX-20,ratY-10);
    } else {
      triangle(ratX,ratY,ratX-20,ratY,ratX-20,ratY+10);
    }
  }
  if(ratX > width){
    ratX = 1;
  }
}

}
//how the balls bounce off each other
void ballBounce() {
  if (dist(redX, redY, bluX, bluY)<ballDia) {
    temp=redDX; redDX=bluDX; bluDX=temp;  //red blu
    temp=redDY; redDY=bluDY; bluDY=temp;
  }
  if (dist(bluX, bluY, yelX, yelY)<ballDia) {
    temp=bluDX; bluDX=yelDX; yelDX=temp;  //blu yel
    temp=bluDY; bluDY=yelDY; yelDY=temp;
  }
  if (dist(redX, redY, yelX, yelY)<ballDia) {
    temp=redDX; redDX=yelDX; yelDX=temp;  //red yel
    temp=redDY; redDY=yelDY; yelDY=temp;
  }
}

*/
