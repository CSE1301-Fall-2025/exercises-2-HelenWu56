package module4._02graphics;

import java.awt.Color;
import java.awt.event.KeyEvent; //Quick fix

import edu.princeton.cs.introcs.StdDraw;

public class E05MovingBall {

	/*
	 * Exercise: Read and run the code below and make sure you
	 * understand how it works before proceeding.
	 */
	public static void main(String[] args) {
		//starting positions(turn into arrays)
		int numberOfBalls = 3;
		double[] ballX = new double[numberOfBalls]; //X-coordinate of ball
		double[] ballXVelocity = new double[numberOfBalls];
		double[] ballY = new double[numberOfBalls];
		double[] ballYVelocity = new double[numberOfBalls];

		//double[] ballXVelocity = Math.random()*0.05;

		//Generating starting values
		for(int i = 0; i < numberOfBalls; i++){
			ballX[i] = Math.random();
			ballY[i] = Math.random();
			ballXVelocity[i] = Math.random()*0.05;
			ballYVelocity[i] = Math.random()*0.05;
		}

		double playerX = 0.5;
		double playerY = 0.5;
		double playerSpeed = 0.01; //stuff for the player is not in the array

		int score = 0;
		long passedTime = System.currentTimeMillis(); //long is for int>2billion
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.05);

		//1. Animation loop: one frame drawn per iteration
		while (true) {
			
			//Clear the canvas - remove prior frame
			StdDraw.clear();
			
			//2. update the positions of all moving objects
			for(int i = 0; i < numberOfBalls; i++){

				ballX[i] = ballX[i] + ballXVelocity[i];
				ballY[i] = ballY[i] + ballYVelocity[i];
				if(ballX[i] > 1 || ballX[i] < 0) { //too far right or too far left
					ballXVelocity[i] = -ballXVelocity[i]; //bounce back the wall
				}
				if(ballY[i] > 1 || ballY[i] < 0) { //too far up or too far down
					ballYVelocity[i] = -ballYVelocity[i]; //bounce back the wall
				}
				
				//Check for collisions
				double distance = Math.sqrt(Math.pow(playerX - ballX[i], 2) + Math.pow(playerY - ballY[i], 2));
				if (distance < 0.05){
					playerX = 0.5;
					playerY = 0.5;
					score = 0; //set score to zero once collide
				}
			} //check if every single ball in my array has gone off the edge of screen 
			

			if(StdDraw.isKeyPressed(KeyEvent.VK_W)){ //move up
				playerY += playerSpeed;
			}
			if(StdDraw.isKeyPressed(KeyEvent.VK_S)){ //move down
				playerY -= playerSpeed;
			}

			if(StdDraw.isKeyPressed(KeyEvent.VK_A)){ //move left
				playerX -= playerSpeed;
			}
			if(StdDraw.isKeyPressed(KeyEvent.VK_D)){ //move right
				playerX += playerSpeed;
			}

			long now = System.currentTimeMillis();
			if(now - passedTime > 1000){ //one second has passed
				score++;
				passedTime = now;
			}
			System.out.println(score);

			//ballX = ballX + 0.005;
			//if(ballX > 1) { //too far right
			//	ballVelocity = 0; //back to left
			//}


			//3. draw on canvas
			//StdDraw.point(ballX, 0.5); //halfway from the bottom
			StdDraw.setPenColor(Color.red);
			for(int i = 0; i < numberOfBalls; i++){
				StdDraw.point(ballX[i], ballY[i]);
			}
			StdDraw.setPenColor(Color.black);
			StdDraw.point(playerX, playerY);
			StdDraw.text(0.5,0.1, "Score: " + score); //add text on screen
			
			//pause to make the animation smooth
			StdDraw.show();
			StdDraw.pause(10); //pause for 10 milliseconds per frame, the higher the number, the slower the ball moving
			
		}
	}
}
