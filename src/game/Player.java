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

public interface Player {

    public String getName();

    public int getLife();

    public int getDamages();

    public void hurt(int domages);

    public void attack(Player other);

    public PlayerState saveState();

    public void restoreState(PlayerState state);

    public void printStatus();

    public class PlayerState {

        String name;
        int life;
        int baseDamages;

        public PlayerState(String name, int life, int baseDamages) {
            this.name = name;
            this.life = life;
            this.baseDamages = baseDamages;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getLife() {
            return life;
        }

        public void setLife(int life) {
            this.life = life;
        }

        public int getBaseDamages() {
            return baseDamages;
        }

        public void setBaseDamages(int baseDamages) {
            this.baseDamages = baseDamages;
        }
    }
}
