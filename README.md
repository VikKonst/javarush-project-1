# javarush-project-1
## 1. Short description of the project

The program which is realized in the frame of the project  
allows to fulfill the following tasks:

1. Encrypt the text in Russian language using the method  
of Caesar cipher;
2. Decrypt the text in Russian language which has been  
ciphered with the use of Caesar cipher;
3. Hack the text in Russian language which has been  
ciphered with the use of Caesar cipher.

Program launch: 

`java -jar ./dist/Cryptoanalyser.jar`

##2. Restrictions

The program works only with files in ***.txt*** format.  
It is recommended to use ***Windows-1251*** encoding to achieve  
the correct performance of the program in case of launching  
the program on Windows.

##3. Description of the Caesar cipher algorithm

Caesar cipher is based on the method of substitution:  
each character in the initial text is replaced by a character  
which is on some constant number of positions to the left  
or to the right of it in the alphabet.  
The shift of the character is determined by a key which  
is defined by user.<br>
![w](http://assets.stickpng.com/images/584bee68a62aaa830c43edac.png)

##4. Description of classes

1. The root package `com/javarush/cryptoanalyser` contains  
class `Main` which is the entry point of the program.
2. The package `consoleui` contains class `Dialogue` which  
realizes user interface.
3. The package `cryptoanalyses` contains the following classes:  
   * `ApplicationCostants` - class which contains the alphabet  
on the basis of which all the tasks fulfilled.
   * `ApplicationException` - exception which is generated in case  
when the character of the initial text is not existed in the  
alphabet.
   * `IOUtils` - class which is responsible for reading data  
from files and writing data to files.
   * `Encryption`, `Decryption`, `BruteForce` - classes which  
realize the main logic of the program. `BruteForce` has a  
public static class field `file` which accepts a link to  
`FrequentWordsForBruteForceRealization.txt` - a list of frequently  
used words in the Russian language. Method `hack` of the class  
`BruteForce` takes an array of characters as an input, tries  
to decrypt it by enumerating the keys and comparing the decryption  
results with the list `FrequentWordsForBruteForceRealization.txt`.  
The option which has the biggest amount of matches with the list  
will be written to file and provided to user as an output. If no  
matches will be found the method `hackAllKeys` will return as many  
files in the output as there are the keys. 

##5. Links

1. [Link](https://github.com/VikKonst/javarush-project-1) to GitHub source code.






