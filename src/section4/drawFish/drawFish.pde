int foodX = 100;
int foodY = 20;
int foodX2 = 100;
int foodY2 = 20;
int foodX3 = 100;
int foodY3 = 20;
int score = 0;

void setup(){
  
  size(600, 600);
  
  
}

void draw() {
  background (0,200,255);
 
  
  //Yeet
  if (foodY2 >= 600) {
  foodY2 = 20;
  }
  if (foodY2 == 20){
  foodX2 = (int) random(width-20);
  }
  fill(150,75, 0);
  noStroke();
  ellipse(foodX2, foodY2, 25, 25);
  foodY2 = foodY2 + 6;
  //BOB THE BUILDER
  if (foodY3 >= 600) {
  foodY3 = 20;
  }
  if (foodY3 == 20){
  foodX3 = (int) random(width-20);
  }
  fill(150,75, 0);
  noStroke();
  ellipse(foodX3, foodY3, 25, 25);
  foodY3 = foodY3 + 7;
  
    
   Fish();   
}

void Fish(){
   noStroke();
     fill(255,255,255);
     ellipse(mouseX-17,mouseY-17,20,20); //back side eye
     fill(255,200,88);
     ellipse(mouseX,mouseY,90,50); //body
     triangle(mouseX+30,mouseY,mouseX+70,mouseY+30,mouseX+70,mouseY-30); //tail
     stroke(0);
     triangle(mouseX,mouseY,mouseX+15,mouseY+10,mouseX+15,mouseY-10); //side fin
     noStroke();
     fill(255,200,88);
     ellipse(mouseX,mouseY,15,15); //side fin cover
     noStroke();
     fill(255,255,255);
     ellipse(mouseX-25,mouseY-15,20,20); //front eye
     fill(0,0,0);
     ellipse(mouseX-25,mouseY-15,5,5); //pupil
     fill(0,200,255);
     ellipse(mouseX-45,mouseY,25,25); //mouth
   }
   if Fish 
