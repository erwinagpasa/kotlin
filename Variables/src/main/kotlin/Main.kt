fun main() {

    //  Variables that can be reassigned use the "var" keyword

    var userName: String = "Erwin" //userName accept only String
    userName = "Smith"

    //  Read-only local variables are defined using the keyword "val". They can be assigned a value only once.
    val myNumber: Int = 1204

    println("Hello $userName you number is $myNumber")

}

    /*
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment
    */