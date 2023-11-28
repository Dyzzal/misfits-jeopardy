execute if score @e[name="dummy",limit=1] canBuzz matches 1 run scoreboard players set @p turn 1
scoreboard players reset @e canBuzz
#change noise to custom buzz
execute if score @p turn matches 1 run playsound block.amethyst_block.chime master @a
#add 5 second timer