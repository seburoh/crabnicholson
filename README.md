# CRAB NICHOLSON'S EXTREME SLEEPOVER

This is a text adventure game where you get to roam around CRAB NICHOLSON'S house and prep for a night of movie watching with the big crab himself! Run, jump, and climb your way into his house so you can have an EXTREME SLEEPOVER to call your own!

<center><img src="https://cdn.discordapp.com/attachments/149944536871731200/852289497239519232/unknown.png" alt="gameplay" /></center>

CRAB NICHOLSON'S EXTREME SLEEPOVER is run through the terminal, it prompts what kinds of commands it's looking for. In most cases the following is true:
* look OBJECT
* move PLACE
* take OBJECT
* use OBJECT on OBJECT

## To Play

Compile extreme_sleepover/src/Main which can be done via javac *.java in terminal. This project requires Java to be installed, as well as an internet browser to handle URLs and audio files. If not running this on the machine used for testing, give main a string argument of the absolute path of /files/, including the /files/ folder itself.

**Example**: java Main C:/stuff/files/

Alternatively, an included crab.jar file can be used, if more convenient.

**Example**: java -jar crab C:/stuff/files/

# Included Classes
* Main - Launch this to play the game!
  * It accepts a string arg for the absolute folder path of /files/ within this project. Ex: C:/downloads/files/
  
The following files are utilized by Main and are not meant to be run on their own:
* Browser - Launches links, see dependencies.
* Clear - Utility for clearing terminals and having delay between lines of code.
* Items - A listing of all item descriptions under various circumstances.
* Room - A class for rooms to hold their respective items and exits.

# Dependencies
This program has dependencies of being able to open the following filetypes/links on the device:
* URLs
* MP3
* OGG
* FLAC

It is suggestable that if you have a default application for audio files, to ensure they're not set to auto-repeat and have their volume not max. As this will make a better game experience.

# Current bugs
* Rarely output notes player cannot move, but they move anyway. This is not intended to be fixed.

# Audio Files
This was originally a private academic project, in this public GitHub posting copyrighted audio files are not provided Below are the titles of files used if desired to be added by individual users. With each, the expected filename from the program is listed. Files belong in the files folder.
* Original Theme Song by LAPFOX (1crab.mp3)
* Emf02_Edit#070705 by Shiro Sagisu (6credit.flac)
* LAHEE by Masayoshi Soken (3lahee.ogg)
* Dance Hymn of the Soul (Disco In Velvet Room) by Ryouta Kozuka and Shoji Meguro (2persona.mp3)
* Zelda Secret Opening Sound Effect by Koji Kondo (4secret.mp3)
* Welcome Back Soken by Husky the Geek (5soken.mp3)
* Mission Complete by Jake Kaufman  (7mission.mp3)

# Resources

1. [ASCII Art Generator](https://patorjk.com/software/taag/)
1. [Comparing Enum to String via StackOverflow](https://stackoverflow.com/questions/9858118/whats-the-proper-way-to-compare-a-string-to-an-enum-value)
1. [Lambda Switches via JavaCodeGeeks](https://www.javacodegeeks.com/2020/05/switch-as-an-expression-in-java-with-lambda-like-syntax.html)
1. [English to OwO translator via lingojam](https://lingojam.com/EngwishtoOwOtwanswatow)
