package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import static javagame.Game.*;
import org.newdawn.slick.geom.Rectangle;

public class Play extends BasicGameState{
    
   boolean quit = false;
   private Player player;
   
   public Play(int state){
   }
   
   public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
       player = new Player(gc,10,300,20,20);
   }
   
   public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
      player.render();
   }
   
   public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
      
      player.update(delta);
       
      Input input = gc.getInput();
      if(input.isKeyDown(Input.KEY_M)){
         sbg.enterState(GAME_STATE_MENU);
      }   
      if(input.isKeyDown(Input.KEY_ESCAPE)){
         System.exit(0);
      } 
   }
   
   public int getID(){
      return 1;
   }
}