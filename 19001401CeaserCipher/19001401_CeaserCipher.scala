object ceasar_cipher{
	def main(args:Array[String]){
		val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		val key=3
		val s=scala.io.StdIn.readLine("Enter the the word(plain text) to decrypt or encrypt:")
		println("1.Encrypt\n2.Decrypt\nEnter the choice :")
		val i=scala.io.StdIn.readInt()
		if(i==1)
			println(cipher(encrypt,s,key,alphabet))
		if(i==2)
			println(cipher(decrypt,s,key,alphabet))
	}

	val encrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
	val decrypt=(c:Char,key:Int,a:String)=>if(a.indexOf(c.toUpper)<key) a(a.size-(key-a.indexOf(c.toUpper))) else a((a.indexOf(c.toUpper)-key)%a.size)
	
	val cipher=(fun:(Char,Int,String)=>Char,txt:String,key:Int,a:String)=>txt.map(fun(_,key,a))
}