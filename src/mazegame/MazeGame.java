/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

import mazegame.models.mazeMap.MazeMap;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;
import mazegame.factory.EnchantedMazeFactory;
import mazegame.game.GameHelper;
import mazegame.game.GameObjects;
import mazegame.models.abstracts.AbstractMazeMap;
import mazegame.models.abstracts.Item;
import mazegame.models.abstracts.MapSite;
import mazegame.models.abstracts.Side;
import mazegame.models.concrete.bag.Bag;

/**
 *
 * @author SCHETTINO
 */
public class MazeGame implements Observer {

    public static void main(String[] args) throws IOException {
        AbstractMazeMap mazeMap = new MazeMap();
        GameObjects.setMaze(mazeMap.createMaze(new EnchantedMazeFactory()));
        GameObjects.setBag(new Bag());
        MazeGame game = new MazeGame();
        GameObjects.getMaze().addObserver(game);
        game.play();
    }

    public void play() {
        Scanner keyboard = new Scanner(System.in);
        GameObjects.getMaze().setCurrentRoom(GameObjects.getMaze().roomNo(0));
        boolean fim = false;
        while (!fim) {
            GameHelper.printSides();
            char escolha = keyboard.nextLine().toLowerCase().charAt(0);
            Side side = GameHelper.charToSide(escolha);
            if ((side == null)) {
                switch (escolha) {
                    case GameHelper.EXIT_CHAR: {
                        fim = true;
                        break;
                    }
                    case GameHelper.PRINT_ROOM: {
                        GameObjects.getMaze().getCurrentRoom().printRoom();
                        break;
                    }
                    case GameHelper.PRINT_BAG: {
                        GameObjects.printBag();
                        break;
                    }
                    default: {
                        GameHelper.printInvalidAction();
                    }
                }
            } else {
                MapSite site = GameObjects.getMaze().getCurrentRoom().getSide(side);
                GameHelper.printActions();
                escolha = keyboard.nextLine().toLowerCase().charAt(0);
                switch (escolha) {
                    case GameHelper.ENTER_ROOM: {
                        site.enter();
                        if (GameObjects.getMaze().getCurrentRoom().isExit()) {
                            fim = true;
                        }
                        break;
                    }
                    case GameHelper.FIND_ITEM: {
                        if (site.getItem() != null) {
                            Item item = site.getItem();
                            GameObjects.getBag().add(item);
                            GameHelper.printItem(item);
                            site.setItem(null);
                        } else {
                            GameHelper.printItemNotFound();
                        }
                        break;
                    }
                    case GameHelper.USE_ITEM: {
                        GameObjects.printBag();
                        if (!GameObjects.getBag().isEmpty()) {
                            try {
                                int itemEscolhido = keyboard.nextInt();
                                if (itemEscolhido < GameObjects.getBag().size()) {
                                    if (GameObjects.getBag().get(itemEscolhido).use(site)) {
                                        GameObjects.getBag().remove(itemEscolhido);
                                    }
                                }
                                keyboard.nextLine();
                            } catch (InputMismatchException e) {
                                GameHelper.printInvalidAction();
                            }
                        }
                        break;
                    }

                }

            }

        }
    }

    @Override
    public void update(Observable o, Object o1) {
        GameObjects.getMaze().getCurrentRoom().printRoom();
    }
}
