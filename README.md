MotherOfPearl
==============

Mother of Pearl Minecraft 1.6.2 Mod
<No link at this time>
This is my source, open to anyone for modification.
Please don't release anyone's work and say it's your own.


TODO:

Nothing Urgent. I finally figured out the bow. Took me long enough.

Maybe Never TODO(Maybe after everything above is done):

VI. Add Underwater Cities and Floating Fishing Villages to WorldGen.


---------Done---------

II. make recipe for shells not use an entire pearling knife, but only cause damage to knife.
	I decided to just remove the need for a pearling knife to make shells for now. Just put the oysters in a crafting grid to
	get 2 shells. It's enough for now anyway since I only have one thing that needs shells, and it only needs 2. I may add more later.

III. figure out why the shell bra texture shows as the pearl chestplate instead. (texture points to shell_1, not pearl_1)
    (I even filled in the rest of the texture file with other armor types instead of transparency... Also created a shell_2
    file for "ghost" leggings. Still the shell bra takes on the Pearl Chestplate texture. I might just scrap it if I can't
    get the texture to work.)
	
	Sweet! I fixed the texture.
	
	Where I needed "public String getArmorTexture(blah blah blah..." I instead put "public String getArmorTextures(blah blah blah..."
	
	See the difference? It took me a week and a half to see the problem.
	I figured it out when I visited http://www.minecraftforum.net/topic/1897284-162-forge-custom-armor-texture-wont-load/ though I'm not sure how I screwed that in the first place.
	
IV. Add ability to repair using pearls in an anvil. Repair using same item (to retain enchantments) works, but I would like
    to add a less expensive recipe

V. (Make block that extends clay. Make it drop 3 clay (the item) and one oyster.
      OR
   Make a new entity "Oyster" that drops the item "oyster" when broken.)
   
   Finally added a clayOyster block that drops 4 oysters. Now to add it to the worldgen for clay.
   
   UPDATE: Replaced worldGen for clay with my block, then added 4% chance to drop oysters instead of item.clay.
