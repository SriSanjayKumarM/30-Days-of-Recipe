package com.example.a30daysofrecipes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysofrecipes.R

data class Recipes(
    @StringRes val number: Int,
    @StringRes val title: Int,
    @DrawableRes  val dish: Int,
    @StringRes val desc: Int
)

val dishes = listOf(
    Recipes(R.string.dish_1, R.string.dish1_name, R.drawable.chapathi, R.string.desc1),
    Recipes(R.string.dish_2, R.string.dish2_name, R.drawable.chapathi_fish_gravy, R.string.desc2),
    Recipes(R.string.dish_3, R.string.dish3_name, R.drawable.chicken_bbq, R.string.desc3),
    Recipes(R.string.dish_4, R.string.dish4_name, R.drawable.chicken_chettinad_masala, R.string.desc4),
    Recipes(R.string.dish_5, R.string.dish5_name, R.drawable.chicken_naatukozhi_gravy, R.string.desc5),
    Recipes(R.string.dish_6, R.string.dish6_name, R.drawable.chicken_pepper_masala, R.string.desc6),
    Recipes(R.string.dish_7, R.string.dish7_name, R.drawable.chilli_paratha, R.string.desc7),
    Recipes(R.string.dish_8, R.string.dish8_name, R.drawable.diet_chicken, R.string.desc8),
    Recipes(R.string.dish_9, R.string.dish9_name, R.drawable.egg_masala, R.string.desc9),
    Recipes(R.string.dish_10, R.string.dish10_name, R.drawable.fish_bbq, R.string.desc10),
    Recipes(R.string.dish_11, R.string.dish11_name, R.drawable.guntur_chicken_gravy, R.string.desc11),
    Recipes(R.string.dish_12, R.string.dish12_name, R.drawable.home_made_brownie, R.string.desc12),
    Recipes(R.string.dish_13, R.string.dish13_name, R.drawable.home_made_cake, R.string.desc13),
    Recipes(R.string.dish_14, R.string.dish14_name, R.drawable.home_made_falooda, R.string.desc14),
    Recipes(R.string.dish_15, R.string.dish15_name, R.drawable.home_made_jelly, R.string.desc15),
    Recipes(R.string.dish_16, R.string.dish16_name, R.drawable.home_made_pizza, R.string.desc16),
    Recipes(R.string.dish_17, R.string.dish17_name, R.drawable.kaju_katli, R.string.desc17),
    Recipes(R.string.dish_18, R.string.dish18_name, R.drawable.mutton_gravy_rice, R.string.desc18),
    Recipes(R.string.dish_19, R.string.dish19_name, R.drawable.oreo_paniyaram, R.string.desc19),
    Recipes(R.string.dish_20, R.string.dish20_name, R.drawable.paneer_butter_masala, R.string.desc20),
    Recipes(R.string.dish_21, R.string.dish21_name, R.drawable.prawn_pepper_masala, R.string.desc21),
    Recipes(R.string.dish_22, R.string.dish22_name, R.drawable.quill_gravy, R.string.desc22),
    Recipes(R.string.dish_23, R.string.dish23_name, R.drawable.white_sauce_pasta, R.string.desc23),
)