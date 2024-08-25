package com.example.calculatorios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import com.example.calculatorios.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    lateinit var binding :ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAc.setOnClickListener{
            binding.inputTv.text=""
            binding.resultTv.text=""
        }

        binding.btn0.setOnClickListener{
            binding.inputTv.append("0")
        }

        binding.btn1.setOnClickListener{
            binding.inputTv.append("1")
        }

        binding.btn2.setOnClickListener{
            binding.inputTv.append("2")
        }

        binding.btn3.setOnClickListener{
            binding.inputTv.append("3")
        }

        binding.btn4.setOnClickListener{
            binding.inputTv.append("4")
        }

        binding.btn5.setOnClickListener{
            binding.inputTv.append("5")
        }

        binding.btn6.setOnClickListener{
            binding.inputTv.append("6")
        }

        binding.btn7.setOnClickListener{
            binding.inputTv.append("7")
        }

        binding.btn8.setOnClickListener{
            binding.inputTv.append("8")
        }

        binding.btn9.setOnClickListener{
            binding.inputTv.append("9")
        }

        binding.btnAdd.setOnClickListener{
            binding.inputTv.append("+")
        }

        binding.btnMultiply.setOnClickListener{
            binding.inputTv.append("*")
        }

        binding.btnSub.setOnClickListener{
            binding.inputTv.append("-")
        }

        binding.btnDivide.setOnClickListener{
            binding.inputTv.append("/")
        }

        binding.btnUk.setOnClickListener{
            binding.inputTv.append("-")
        }

        binding.btnRem.setOnClickListener{
            binding.inputTv.append("%")
        }
        binding.btnDot.setOnClickListener{
            binding.inputTv.append(".")
        }

        binding.btnEqual.setOnClickListener{

            val expression= ExpressionBuilder(binding.inputTv.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()

            if(result==longresult.toDouble()){
                binding.resultTv.text=longresult.toString()
            }
            else{
                binding.resultTv.text=result.toString()
            }
        }
    }
}