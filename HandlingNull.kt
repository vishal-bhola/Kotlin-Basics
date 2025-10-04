fun main() {

    // TODO: If any line/program is giving error, please comment that line/program and then run again for successful execution

    //! Invalid - We can't just simply assign null value to a variable whether it's String or Int - When data-type is explicitly defined.
    var myString: String = null
    var myInt: Int = null

    println(myString + " "+myInt)
    //* Output:
    // HandlingNull.kt:4:28: error: null cannot be a value of a non-null type 'String'.
    // var myString: String = null
    // ^^^^
    // HandlingNull.kt:6:22: error: null cannot be a value of a non-null type 'Int'.
    // var myInt: Int = null
    //  ^^^^
    

    


    //? Assigning null when we didn't explicitly provide any data-type, then it will work:
    var myNewString = null
    var myNewInt = null

    println(myNewString + " " + myNewInt)
    //* Output: null null



    //? Another way to assign null if we want to use data-type - Question_Mark (?) can be used
    //? By Assigning Question_Mark, We are telling that it's an Optional value, it can be null or it can be a value as well.
    var myNullString: String? = null
    var myNullInt: Int? = null

    println(myNullString + " "+myNullInt)
    //* Output: null null



    // Using .length - It will give error, as it's null and null doesn't have any length
    // println(myNullString.length)
    //* Output:
    // HandlingNull.kt:37:25: error: only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type 'String?'.
    // println(myNullString.length)




    // But if we re-assigned the value of myNullString, and then do .length, it will still give an error in some version, in some it won't
    // Try this out:
    myNullString = "this is my new non-empty String"
    // It's preferred to use ?. because it's now storing an optional value, as it 's value can be null or not
    println(myNullString?.length)








    //* Alternatively we can use !! also, intead of ?. But using !! means you are 100% sure that there is a value in it. If there is no value it will give NPE */
    var oneMoreString: String? = null
    println(oneMoreString?.length) // Safer to use
    //* Output: null

    println(oneMoreString!!.length)
    //* Output:
    // Exception in thread "main" java.lang.NullPointerException
	// at HandlingNullKt.main(HandlingNull.kt:63)
	// at HandlingNullKt.main(HandlingNull.kt)
}