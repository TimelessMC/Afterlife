package com.steve.nukkit.AfterLife.modules;

import com.steve.nukkit.AfterLife.handler.Mongodb;

public class Kills {

    public void add(String uuid) {
        Mongodb.update(uuid, "kills", Mongodb.query(uuid, "uuid").getInteger("kills") + 1);
        Mongodb.update(uuid, "kill-streak", Mongodb.query(uuid, "uuid").getInteger("kill-streak") + 1);
    }

    public void remove(String uuid) {
        Mongodb.update(uuid, "kills", Mongodb.query(uuid, "uuid").getInteger("kills") - 1);
    }

    public Integer get(String uuid) {
        return Mongodb.query(uuid, "uuid").getInteger("kills");
    }

}
