A projektet 11-es Java verzió mellett fejlesztettem.

A javac -cp antlr.jar:. ScriptParser.java && java -cp antlr.jar:. ScriptParser ./input1.txt paranccsal teszteltem, ahol az antlr.jar az az antlr verzió, amelyre az okt.sed-es link mutat.

Ismert limitációk:

A TIME konstans a futás során.
A for ciklus a 3. paraméter után igényel pontos vesszőt.
