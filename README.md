# Misfits Jeopardy
Jeopardy for Misfits
## How to use
-Install the datapack in a minecraft world, reload datapacks, then run `/function jeo:load`(this should run automatically the first time you install the datapack).<br />
-Run `/function jeo:dummy` to spawn the dummy armor stand at your position. It is used for most of the variables and is required.<br />
-If `/function jeo:can_buzz` is run, it will allow `/function jeo:buzz` to be used which selects the person who ran the command/activated the command block(closest player to command block).<br />
-`/function jeo:correct` and `/function jeo:incorrect` will add or subtract the possiblePoints(set to number of points of question) objective from the selected player's score.<br />
## Extra info
-Objectives mean scoreboard variables.<br />
-Score and turn objectives are respective to each player, while others such as canBuzz are stored in the dummy armor stand. Those can be accessed by using `@e[name="dummy"]` as the player selector(i.e. `/scoreboard players get @e[name="dummy"] canBuzz`).<br />
## To-Do
- [ ] Add timer to buzz function<br />
- [ ] Make proper scoreboard<br />
- [ ] Begin board<br />
- [ ] Begin texture pack<br />
- [ ] More that I haven't thought of yet<br />
