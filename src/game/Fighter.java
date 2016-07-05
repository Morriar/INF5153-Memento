/*
 * Copyright 2016 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package game;

public class Fighter implements Player {

    String name;

    public Fighter(String name) {
        this.name = name;
    }

    int life = 100;

    int baseDamages = 5;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLife() {
        return life;
    }

    @Override
    public int getDamages() {
        return baseDamages;
    }

    @Override
    public void hurt(int domages) {
        System.out.println(getName() + " is hurt (" + domages + " dmg)");
        life -= domages;
    }

    @Override
    public void attack(Player other) {
        int dmg = getDamages();
        other.hurt(dmg);
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public PlayerState saveState() {
        return new PlayerState(getName(), getLife(), getDamages());
    }

    @Override
    public void restoreState(PlayerState state) {
        this.name = state.getName();
        this.life = state.getLife();
        this.baseDamages = state.getBaseDamages();
    }

    @Override
    public void printStatus() {
        System.out.println("[" + getName() + ": " + getLife() + "]");
    }
}
