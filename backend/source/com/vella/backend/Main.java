package com.vella.backend;

import com.vella.model.Game;
import com.vella.model.GameCollection;
import com.vella.model.User;
import com.vella.model.product.Product;

import java.util.function.Function;
import javax.script.*;

/**
 * Created by s on 8/23/15.
 */
public class Main {
    // apis to perform searches against es
    // apis to query products/retrieve products from db
    // apis to retrieve user info from db
    // apis to retrieve game info from db
    // apis to retrieve

    public static void main(String[] args) throws ScriptException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        @SuppressWarnings("unchecked")
        Function<Product, Boolean> f = (Function<Product, Boolean>)engine.eval(
                String.format("new java.util.function.Function(%s)", "function(x) x.getPrice() == 100"));
        for (int i = 1; i < 3; i++) {
            System.out.println(f.apply(new Product("" + i, "", "", i * 100, null, null, null)));
        }

    }

    public static class AdministratorActions {
        public void createNewGame(Game game) {

        }

    }

    public static class UsersAction {
        public UsersAction(User user) {
            this.user = user;
        }

        User user;

        public void createOrUpdateCollection(GameCollection gameCollection) {
            gameCollection.getGame().getGameCollections().add(gameCollection);
        }

        public void invest(GameCollection gameCollection) {

        }
    }
}
