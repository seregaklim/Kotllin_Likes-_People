fun  main () {
     val likes = 353556

     val textLikes = if (likes % 10 == 1 && likes % 100 !== 11) "Вам поставили $likes лайк" else
          if (likes % 10 in 2..4 && likes % 100 !in 11..19) "Вам поставили $likes лайка"
               else "Вам поставили $likes лайков"

          println (textLikes)
     }






