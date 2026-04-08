func isAnagram(s string, t string) bool {
    if len(s) != len(t) {
        return false
    }
    var sArray  [26] int
    var tArray [26] int

    for _, c := range s {
        sArray[c-'a']++
    }
    for _, c := range t {
        tArray[c-'a']++
    }
    for i := 0; i < 26; i++ {
        if sArray[i] != tArray[i]{
            return false
        }
    }
    return true
}
