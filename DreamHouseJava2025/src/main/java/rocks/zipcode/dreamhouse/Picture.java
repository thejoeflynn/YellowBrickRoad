package rocks.zipcode.dreamhouse;

import java.lang.reflect.Method;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private myRectangle ground;
    private myRectangle pillar1;
    private myRectangle pillar2;
    private myRectangle building3;
    private Triangle roof;
    private Circle sun;
    private Circle cloud1;
    private Circle cloud2;
    private Circle cloud3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    public void cloud(int x, int y)
    {
        cloud1 = new Circle();
        cloud1.changeColor("white");
        cloud1.moveHorizontal(x + 100);
        cloud1.moveVertical(y + 20);
        cloud1.changeSize(60);
        cloud1.makeVisible();

        cloud2 = new Circle();
        cloud2.changeColor("white");
        cloud2.moveHorizontal(x + 120);
        cloud2.moveVertical(y + 30);
        cloud2.changeSize(50);
        cloud2.makeVisible();

        cloud3 = new Circle();
        cloud3.changeColor("white");
        cloud3.moveHorizontal(x + 80);
        cloud3.moveVertical(y + 30);
        cloud3.changeSize(50);
        cloud3.makeVisible();
    }
    /**
     * Draw this picture.
     */
    public void draw()
    {
        ground = new myRectangle();
        ground.changeColor("grass");
        ground.moveHorizontal(-100);
        ground.moveVertical(390);
        ground.changeSize(1000, 90);
        ground.makeVisible();

        building3 = new myRectangle();
        building3.changeColor("background");
        building3.moveHorizontal(230);
        building3.moveVertical(220);
        building3.changeSize(330, 165);
        building3.makeVisible();

        pillar1 = new myRectangle();
        pillar1.changeColor("pillarwhite");
        pillar1.moveHorizontal(230);
        pillar1.moveVertical(210);
        pillar1.changeSize(35, 170);
        pillar1.makeVisible();

        pillar1 = new myRectangle();
        pillar1.changeColor("pillarwhite");
        pillar1.moveHorizontal(290);
        pillar1.moveVertical(210);
        pillar1.changeSize(35, 170);
        pillar1.makeVisible();

        pillar1 = new myRectangle();
        pillar1.changeColor("pillarwhite");
        pillar1.moveHorizontal(350);
        pillar1.moveVertical(210);
        pillar1.changeSize(35, 170);
        pillar1.makeVisible();

        pillar2 = new myRectangle();
        pillar2.changeColor("pillarwhite");
        pillar2.moveHorizontal(430);
        pillar2.moveVertical(210);
        pillar2.changeSize(35, 170);
        pillar2.makeVisible();

        pillar2 = new myRectangle();
        pillar2.changeColor("pillarwhite");
        pillar2.moveHorizontal(490);
        pillar2.moveVertical(210);
        pillar2.changeSize(35, 170);
        pillar2.makeVisible();

        pillar2 = new myRectangle();
        pillar2.changeColor("pillarwhite");
        pillar2.moveHorizontal(550);
        pillar2.moveVertical(210);
        pillar2.changeSize(35, 170);
        pillar2.makeVisible();

        roof = new Triangle();
        roof.changeColor("blue");
        roof.changeSize(100, 165);
        roof.moveHorizontal(417);
        roof.moveVertical(410);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("pillarwhite");
        roof.changeSize(100, 100);
        roof.moveHorizontal(417);
        roof.moveVertical(410);
        roof.makeVisible();

        building3 = new myRectangle();
        building3.changeColor("blue");
        building3.moveHorizontal(195);
        building3.moveVertical(390);
        building3.changeSize(430, 15);
        building3.makeVisible();

        building3 = new myRectangle();
        building3.changeColor("pillarwhite");
        building3.moveHorizontal(207);
        building3.moveVertical(373);
        building3.changeSize(400, 25);
        building3.makeVisible();

        roof = new Triangle();
        roof.changeColor("pillarwhite");
        roof.changeSize(100, 400);
        roof.moveHorizontal(417);
        roof.moveVertical(155);
        roof.makeVisible(); 

        sun = new Circle();
        sun.changeColor("sunyellow");
        sun.moveHorizontal(50);
        sun.moveVertical(-20);
        sun.changeSize(130);
        sun.makeVisible();

        this.cloud(-53, 20);
        this.cloud(40, -8);
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
