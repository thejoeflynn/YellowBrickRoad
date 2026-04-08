package rocks.zipcode.dreamhouse;

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
    private myRectangle pillar3;
    private myRectangle building3;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        ground = new myRectangle();
        ground.changeColor("green");
        ground.moveHorizontal(-100);
        ground.moveVertical(390);
        ground.changeSize(1000, 90);
        ground.makeVisible();

        pillar1 = new myRectangle();
        pillar1.changeColor("white");
        pillar1.moveHorizontal(230);
        pillar1.moveVertical(210);
        pillar1.changeSize(35, 170);
        pillar1.makeVisible();

        pillar1 = new myRectangle();
        pillar1.changeColor("white");
        pillar1.moveHorizontal(290);
        pillar1.moveVertical(210);
        pillar1.changeSize(35, 170);
        pillar1.makeVisible();

        pillar1 = new myRectangle();
        pillar1.changeColor("white");
        pillar1.moveHorizontal(350);
        pillar1.moveVertical(210);
        pillar1.changeSize(35, 170);
        pillar1.makeVisible();

        pillar2 = new myRectangle();
        pillar2.changeColor("white");
        pillar2.moveHorizontal(430);
        pillar2.moveVertical(210);
        pillar2.changeSize(35, 170);
        pillar2.makeVisible();

        pillar2 = new myRectangle();
        pillar2.changeColor("white");
        pillar2.moveHorizontal(490);
        pillar2.moveVertical(210);
        pillar2.changeSize(35, 170);
        pillar2.makeVisible();

        pillar2 = new myRectangle();
        pillar2.changeColor("white");
        pillar2.moveHorizontal(550);
        pillar2.moveVertical(210);
        pillar2.changeSize(35, 170);
        pillar2.makeVisible();

        building3 = new myRectangle();
        building3.changeColor("white");
        building3.moveHorizontal(207);
        building3.moveVertical(373);
        building3.changeSize(400, 25);
        building3.makeVisible();

        roof = new Triangle();
        roof.changeSize(100, 400);
        roof.moveHorizontal(417);
        roof.moveVertical(155);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(0);
        sun.moveVertical(0);
        sun.changeSize(60);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(0);
        sun.moveVertical(15);
        sun.changeSize(45);
        sun.makeVisible();
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
