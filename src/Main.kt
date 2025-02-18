fun main() {

    var admin = UserRole.ADMIN
    var editor = UserRole.EDITOR
    var viewer = UserRole.VIEWER

    println(checkAccess(admin))
    println(checkAccess(editor))
    println(checkAccess(viewer))

    for (user in UserRole.entries){
        println("Role: $user - Access level: ${user.accessLevel}")
    }
}



enum class UserRole(val accessLevel: Int) {
    ADMIN(100), EDITOR(20), VIEWER(10)
}


fun checkAccess(user: UserRole):String{
    return when (user){
         UserRole.ADMIN -> "You are an admin, you have full access"
          UserRole.EDITOR -> "You are an editor, just do what you need and don't ruin anything!"
        UserRole.VIEWER -> "You are just a viewer, you can look but you can't touch"
    }
}