package com.example.android_calculator

import android.annotation.SuppressLint
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.button.*
import kotlinx.android.synthetic.main.input_layout.*

class MainActivity : Activity() {

    var pheptoan: String = ""
    var tinhtoan: String = ""
    var checkDot: Boolean = false
    var checkBang: Boolean = false
    var so1: Double = 0.0
    var so2: Double = 0.0
    var ketqua: Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)

        btn_C.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                manhinhchinh.text = ""
                manhinhphu.text = ""
                checkDot = false
                checkBang = false
                pheptoan = ""
                tinhtoan = ""
            }

        })


        btn_0.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(p0: View?) {
                if (!checkBang) {
                    tinhtoan = manhinhchinh.text.toString()
                    manhinhchinh.text = (tinhtoan + "0").toString()
                }
            }

        })
        btn_1.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(p0: View?) {
                if (!checkBang) {
                    tinhtoan = manhinhchinh.text.toString()
                    manhinhchinh.text = tinhtoan + "1"
                }
            }

        })
        btn_2.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(p0: View?) {
                if (!checkBang) {
                    tinhtoan = manhinhchinh.text.toString()
                    manhinhchinh.text = tinhtoan + "2"
                }
            }

        })
        btn_3.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(p0: View?) {
                if (!checkBang) {
                    tinhtoan = manhinhchinh.text.toString()
                    manhinhchinh.text = tinhtoan + "3"
                }
            }

        })
        btn_4.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(p0: View?) {
                if (!checkBang) {
                    tinhtoan = manhinhchinh.text.toString()
                    manhinhchinh.text = tinhtoan + "4"
                }
            }

        })
        btn_5.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(p0: View?) {
                if (!checkBang) {
                    tinhtoan = manhinhchinh.text.toString()
                    manhinhchinh.text = tinhtoan + "5"
                }
            }

        })
        btn_6.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(p0: View?) {
                if (!checkBang) {
                    tinhtoan = manhinhchinh.text.toString()
                    manhinhchinh.text = tinhtoan + "6"
                }
            }

        })
        btn_7.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(p0: View?) {
                if (!checkBang) {
                    tinhtoan = manhinhchinh.text.toString()
                    manhinhchinh.text = tinhtoan + "7"
                }
            }

        })
        btn_8.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(p0: View?) {
                if (!checkBang) {
                    tinhtoan = manhinhchinh.text.toString()
                    manhinhchinh.text = tinhtoan + "8"
                }
            }

        })
        btn_9.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(p0: View?) {
                if (!checkBang) {
                    tinhtoan = manhinhchinh.text.toString()
                    manhinhchinh.text = tinhtoan + "9"
                }
            }

        })

        btn_Phay.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(p0: View?) {
                if (!checkBang) {
                    if (!checkDot) {
                        tinhtoan = manhinhchinh.text.toString()
                        manhinhchinh.text = tinhtoan + "."
                        checkDot = true
                    }
                }
            }

        })

        btn_Cong.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(p0: View?) {
                if (manhinhchinh.text == "") {

                    so1 = 0.0
                    manhinhphu.text = "0 +"
                } else {
                    so1 = manhinhchinh.text.toString().toDouble()
                    manhinhphu.text = manhinhchinh.text.toString() + "+"
                    manhinhchinh.text = ""
                    tinhtoan = ""
                    pheptoan = "+"
                    checkDot = false
                    checkBang = false
                }
            }

        })
        btn_Tru.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(p0: View?) {
                if (manhinhchinh.text == "") {

                    so1 = 0.0
                    manhinhphu.text = "0 -"
                } else {
                    so1 = manhinhchinh.text.toString().toDouble()
                    manhinhphu.text = manhinhchinh.text.toString() + "-"
                    manhinhchinh.text = ""
                    tinhtoan = ""
                    pheptoan = "-"
                    checkDot = false
                    checkBang = false
                }
            }

        })
        btn_nhan.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(p0: View?) {
                if (manhinhchinh.text == "") {

                    so1 = 0.0
                    manhinhphu.text = "0 *"
                } else {
                    so1 = manhinhchinh.text.toString().toDouble()
                    manhinhphu.text = manhinhchinh.text.toString() + "x"
                    manhinhchinh.text = ""
                    tinhtoan = ""
                    pheptoan = "x"
                    checkDot = false
                    checkBang = false
                }
            }

        })
        btn_chia.setOnClickListener(object : View.OnClickListener {
            @SuppressLint("SetTextI18n")
            override fun onClick(p0: View?) {
                if (manhinhchinh.text == "") {

                    so1 = 0.0
                    manhinhphu.text = "0 /"
                } else {
                    so1 = manhinhchinh.text.toString().toDouble()
                    manhinhphu.text = manhinhchinh.text.toString() + "/"
                    manhinhchinh.text = ""
                    tinhtoan = ""
                    pheptoan = "/"
                    checkDot = false
                    checkBang = false
                }
            }

        })

        btn_Bang.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                if (manhinhchinh.text == "") return
                if (!checkBang) {
                    checkDot = false
                    tinhtoan = manhinhchinh.text.toString()
                    so2 = manhinhchinh.text.toString().toDouble()
                    manhinhphu.text = manhinhphu.text.toString() + manhinhchinh.text.toString() + ""
                    manhinhchinh.text = ""
                    when (pheptoan) {
                        "+" -> ketqua = so1 + so2
                        "-" -> ketqua = so1 - so2
                        "x" -> ketqua = so1 * so2
                        "/" -> {
                            var check0 = so2.toInt()
                            if (check0 == 0) {
                                Toast.makeText(
                                    this@MainActivity,
                                    "Số bị chia phải khác 0",
                                    Toast.LENGTH_LONG
                                )
                            } else
                                ketqua = so1 / so2
                        }
//
//                        else -> Toast.makeText(
//                            this@MainActivity,
//                            "Bạn vui lòng nhập số",
//                            Toast.LENGTH_LONG
//                            )
                    }
                    checkBang = true
                    manhinhchinh.text = ketqua.toString()
                }
            }
        })

        btn_CE.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                if (!checkBang) {
                    var value: String = manhinhchinh.text.toString()
                    if (!value.isEmpty()) {
                        value = value.substring(0, value.length - 1)
                        manhinhchinh.text = value
                    }
                }
            }
        })

        btn_soAm.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                if (!checkBang) {
                    var soMoi = 0.0
                    if(manhinhchinh.text.toString() == "")return
                    var soCheck = manhinhchinh.text.toString().toDouble()
                    soMoi = soCheck.unaryMinus()
                    manhinhchinh.text = soMoi.toString()
                }
            }

//                val sum = 20 / 100 * 10
//                fun calculatePercent(val num: Int, ) {
//                    val result = (num / 100) *
//                }

    })
}

}








