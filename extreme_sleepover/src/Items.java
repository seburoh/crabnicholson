/*
list of item properties for other things to call on
 */

public class Items {

    //list of look OBJECT return descriptions
    public static String itemLook(String str){

        return switch (str){
            case "bed" -> "The bed is rather rotund, considering his pincers maybe best not to ask CRAB NICHOLSON about it";
            case "nightstand" -> "The nightstand with a copy of Hitchhiker's Guide and some rubber bands on it";
            case "rubberbands" -> "A pair of rubber bands, they seem very strong";
            case "dresser" -> "Seems like it's made of mahogany. There's lots of scratches though, thus is the life of having claws";
            case "poster" -> "The poster is a photograph of hit band Nickelback! And it's signed! It's probably worth at least a nickel";
            case "vase" -> "Knowing the antics CRAB NICHOLSON gets up to, it probably holds a malicious genie. Better not touch";
            case "cat" -> "Oh, hi there. Please don't trip me.";
            case "popcorn" -> "A bag of ACT II: BUTTER LOVERS microwave popcorn! Score!";
            case "desk" -> "Is this even wood? It's covered in so much RGB it's hard to tell";
            case "computer" -> "It seems to be playing critically acclaimed MMO Final Fantasy 14. How does he even play with those claws?";
            case "dvd" -> "Probably the DVD he wanted, weird though, there's no label";
            case "tv" -> "Gawking at the TV reminds you that you still need to go back and play Persona 4.";
            case "dvdplayer" -> "One of those fancy ones that eats your discs, seems like it's on and waiting for one";
            case "sofa" -> "Calling it a sofa seems a bit generous, more like the raddest beanbag chair ever. Crab life, you guess";
            case "cdplayer" -> "Seems like there's a disc in it already";
            case "microwave" -> "There's a 29 step instruction booklet on the top of it, seems a bit much";
            case "toast" -> "CRAB NICHOLSON is hard at work preparing the toast";
            case "fridge" -> "What does CRAB NICHOLSON eat anyway? ...Ah, sushi. Lots of sushi. That's fair";
            case "secret" -> """
                    - Teww me...fow whom do you fight?
                    - Hmph =(> . >)= How vewy gwib. And do you bewieve in Eowzea?
                    - Eowzea's unyity is fowged of fawsehoods. Its city-states awe buiwt on deceit. And its faith is an instwument of deception.
                    - It is nyaught but a cobweb of wies. To bewieve in Eowzea is to bewieve in nyothing.
                    - In Eowzea, the beast twibes often summon gods to fight in theiw stead-though youw comwades onwy wawewy wespond in kind. Which is stwange, is it nyot?
                    - Awe the "Twewve" othewwise engaged? I was given to undewstand they wewe youw pwotectows. If you twuwy bewieve them youw guawdians, why do you nyot wepeat the twick that sewved you so weww at Cawtenyeau, and caww them down?
                    - They wiww answew-so wong as you wavish them with cwystaws and gowge them on aethew.
                    - Youw gods awe nyo diffewent fwom those of the beasts-eikons evewy onye. Accept but this, and you wiww see how Eowzea's faith is bweeding the wand dwy.
                    - Nyow is this unknyown to youw mastews. Which pwompts the question: why do they cwing to these fawse deities? What dwives even men of weawnying-even the gweat Wouisoix-to gwuvw at theiw feet?
                    - The answew? Youw mastews wack the stwength to do othewwise ;;w;;
                    - Fow the wowwd of man to mean anything, man must own the wowwd.
                    - To this end, he hath fought evew to waise himsewf thwough confwict-to gwow wich thwough conquest.
                    - And when the dust of battwe settwes, it is evew the stwong who dictate the fate of the weak.
                    - Knyowing this, but a singwe path is open to the impotent wuwew-that of fawse wowship. A path which weads to enyewvation and death.
                    - Onwy a man of powew can wightwy steew the couwse of civiwization. And in this wand of cweeping mendacity, that onye twuth wiww pwuv its sawvation.
                    - Come, champion of Eowzea, face me >w< Youw defeat shaww sewve as pwoof of my weadinyess to wuwe >w<
                    - It is onwy wight that I shouwd take youw weawm. Fow nyonye among you has the powew to stop me =(^ . ^)=
                    """;
            default -> "invalid item";
        };
    }

    //list of take OBJECT return descriptions
    public static String itemTake(String str){

        return switch (str){
            case "bed" -> "You ain't no Major Alex Louis Armstrong, try again when you have the Armstrong Family Training complete";
            case "nightstand" -> "Wow rude";
            case "rubberbands" -> "OBTAINED RUBBER BAND x2";
            case "dresser" -> "You lose to the might and power of Mahogany";
            case "poster" -> "If you touch the poster you'll probably lose all taste in music. Better not";
            case "vase" -> "You don't trust Robin Williams to come out of this vase, sadly";
            case "cat" -> "Cat casts: TRIPAGA! You take 7 physical damage and 1 psychic damage";
            case "popcorn" -> "Obtained ACT II: BUTTER LOVERS Microwave Popcorn!";
            case "desk" -> "Where do you even hold this thing from? It's blindingly bright";
            case "computer" -> "In trying to release it from it's glowy gaol you accidentally hit a button! and wake the computer!" +
                    "\nCRAB NICHOLSON was playing critically acclaimed MMO Final Fantasy 14! It seems like he mains Fisherman.";
            case "dvd" -> "WAY PAST RADICAL! Hopefully it's not XXX, crabs aren't really your thing";
            case "tv" -> "You touch the TV but are not transported into a shadow world :(";
            case "dvdplayer" -> "No no no, you need to find the DVD and bring it here, not the other way around.";
            case "sofa" -> "Each time you try to grab hold of it, it slips out of your hands.";
            case "cdplayer" -> "Don't stop the signal maaaaan!";
            case "microwave" -> """             
                    1. Hold plastic bag of ACT II BUTTER LOVERS microwave popcorn in one hand, making sure you are holding the internal bag of popcorn firmly.
                    2. Using second hand, grip zig-zag textured side of ACT II BUTTER LOVERS plastic bag firmly.
                    3. With second hand, firmly pull towards opposing zig-zag textured side of bag to open the plastic.
                    4. Take out internal bag of ACT II BUTTER LOVERS popcorn from plastic bag and hold on to it.
                    5. Throw away plastic, it knows what it has done.
                    6. Press biggest button on microwave to open it's door.
                    7. Unfold bag of ACT II BUTTER LOVERS twice.
                    8. Ignore written directions on bag of ACT II BUTTER LOVERS, it is always wrong.
                    9. Place unfolded bag of ACT II BUTTER LOVERS microwave popcorn in microwave, LOGO SIDE DOWN, tiny words that claim to be instructions SIDE UP.'
                    10. Close microwave door, locate panel of buttons on front of microwave.
                    11. Press "3", "3", "0" on microwave, followed by "Start". The microwave will now begin to count down time.
                    11.1 Depending on microwave model, a prerequisite button, normally labelled "Time", or "Time Cook", may have to be pressed first. Do not fear, these buttons do not summon the infamous Time Cook.
                    11.2 Depending on microwave model, "Start" may be labelled as a synonym of the word "Start", consult Thesaurus if necessary.
                    12. Locate sizeable large bowl, place near microwave, safely on a flat surface such as a counter top, concave side up.
                    13. When Microwave completes cooking, it will communicate with you. Normally through loud rhythmic beeps, and a message on it's display confirming the food is ready.
                    13.1 The onscreen message may say something cryptic, such as "END", or nothing at all if your microwave isn't very communicative. If confused, consult microwave manual to learn how your microwave communicates.
                    14. Open microwave door, be cautious of ACT II BUTTER LOVERS bag as it will be very hot, especially at one of the two thin edges, as it will be expelling hot air from inside the bag
                    15. Patience is not an option with ACT II BUTTER LOVERS, do not wait for bag to become more safe to hold, you will be able to obtain bag of ACT II BUTTER LOVERS from microwave by identifying the side expelling hot air, and gripping the bag firmly from one of the thin corners adjacent, as these are thicker paper and not as heated as the rest of the bag.
                    16. With second hand, grip opposing thick-paper corner from your previous hand, relative to where the hot air is expelling from the bag, referred to from now on as the "Opening".
                    17. Slowly but firmly pull to increase size of Opening. Noting that as the Opening increases in size, the two thick-paper corners not being held on to are being split open in the process.
                    18. Once the thick-paper corners being split open have reached the end of their thick-paper, cease firm pulling.
                    19. Move hands from their current thick-paper corners to the ones previously split, and repeat steps 17 and 18 on ACT II BUTTER LOVERS.
                    20. Orient bag so you can see the ACT II BUTTER LOVERS logo. Using RIGHT hand for balance on either TOP LEFT thick-paper corner, hold the bag from the BOTTOM thick-paper line, opposite of the Opening, with LEFT hand.
                    21. Hold ACT II BUTTER LOVERS above bowl prepared in step 12.
                    22. Begin moving LEFT hand in a CLOCKWISE motion to rotate ACT II BUTTER LOVERS bag, allowing RIGHT hand to follow the motion while holding on to it's thick-paper corner.
                    23. Mind that Opening stays above bowl at all times. The floor does not deserve your ACT II BUTTER LOVERS.
                    24. When rotation of bag has reached 180 degrees (consult protractor if necessary), cease clockwise motion of left hand.
                    25. Shake bag like you're rocking out to "Photograph" by legendary artist "Nickelback". Do not shake bag as though you were listening to any other song, especially what your kids refer to as "a bop".
                    26. Shake for duration of "Photograph".
                    26.1 If necessary to know length of "Photograph", chant audibly the following incantations: "Hey Google, Play Photograph by Nickelback", "Alexa, Play Photograph by Nickelback", "Hey Siri, remind me to buy an Echo Dot in twenty minutes", and you may receive a helpful response.
                    27. Throw away now mostly-empty bag of ACT II BUTTER LOVERS.
                    28. Hold bowl firmly with both hands, lift from safe flat place, carry to desired location to consume popcorn. Ready to say itadakimasu when you reach your destination.
                    29. Trip over your cat, return to step 1.
                    """;
            case "toast" -> "CRAB NICHOLSON: 'Hey man, it's not ready yet!'";
            case "fridge" -> "The year is not yet 2077, good luck with that";
            case "secret" -> """
                    Look at them, they come to this pwace when they know they awe not puwe. Tenno use the keys, but they
                    awe mewe twespassews. Onwy i, vow, know the twue powew of the void. I was cut in hawf, destwoyed,
                    but thwough it's janus key, the void cawwed to me. It bwought me hewe and hewe i was webown. We
                    cannot bwame these cweatuwes, they awe being wed by a fawse pwophet, an impostow who knows not the
                    secwets of the void. Behowd the tenno, come to scavenge and desecwate this sacwed weawm. My
                    bwothews, did i not teww of this day? did i not pwophesize this moment? now, i wiww stop them.
                    now i am changed, webown thwough the enewgy of the janus key. Fowevew bound to the void. Let it
                    be known, if the tenno want twue sawvation, they wiww way down theiw awms, and wait fow the
                    baptism of my janus key. It is time. I wiww teach these twespassews the wedemptive powew of my
                    janus key. They wiww weawn it's simpwe twuth. The tenno awe wost, and they wiww wesist. But i,
                    vow, wiww cweanse this pwace of theiw impuwity.
                    """;
            default -> "invalid item";
        };
    }

    //list of use OBJECT on TARGET return descriptions
    public static String itemUse(String str, String target){

        if (str.equals("popcorn") && target.equals("microwave")){
            return "Following proper instructions, you make the popcorn and retrieve the bag from the microwave!";
        }
        if (str.equals("dvd") && target.equals("dvdplayer")){
            return "You put the mystery DVD in the player! Are you ready to CALL CRAB NICHOLSON over to watch?";
        }
        if (str.equals("rubberbands") && target.equals("poster")){
            return "You flick the rubberbands at Jeff Nickelback's head, and a secret passage opens!";
        }
        if (str.equals("popcorn") && target.equals("cat")){
            return "Kitty has been fed, hopefully it won't trip you now";
        }
        if (str.equals("dvd") && target.equals("cdplayer")){
            return "Oh dear that's not how this works at all, it looks like the disc already in it will play now?";
        }
        if (str.equals("sacklunch") && target.equals("desk")){
            return "The sack lunch can be a late night gaming snack for later";
        }

        return "Round peg square hole, these things don't go together!";
    }

}
