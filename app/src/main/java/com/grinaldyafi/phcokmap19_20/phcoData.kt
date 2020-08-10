package com.grinaldyafi.phcokmap19_20


object phcoData{
    private var data = arrayOf(
        arrayOf(
            "Fulan bin Fulan",
            "",
            "https://icon-library.com/images/profile-png-icon/profile-png-icon-2.jpg",
            "\n" +
                    "\n" +
                    ""
        ),
        arrayOf(
            "Fulan bin Fulan",
            "",
            "https://icon-library.com/images/profile-png-icon/profile-png-icon-2.jpg",
            "\n" +
                    "\n" +
                    ""
        ),
        arrayOf(
            "Fulan bin Fulan",
            "",
            "https://icon-library.com/images/profile-png-icon/profile-png-icon-2.jpg",
            "\n" +
                    "\n" +
                    ""
        ),
        arrayOf(
            "Fulan bin Fulan",
            "",
            "https://icon-library.com/images/profile-png-icon/profile-png-icon-2.jpg",
            "\n" +
                    "\n" +
                    ""
        )
    )






    val listData: ArrayList<PHCO>
        get() {
            val list = ArrayList<PHCO>()
            for (aData in data) {
                val klub = PHCO()
                klub.name = aData[0]
                klub.est = aData[1]
                klub.photo = aData[2]
                klub.tentang = aData[3]
                list.add(klub)
            }
            return list
        }
}