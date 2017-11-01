package com.daekyung.mykotlinexample02

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.daekyung.mykotlinexample02.databinding.ActivityMainBinding
import com.daekyung.mykotlinexample02.model.MainModel
import com.daekyung.mykotlinexample02.presenter.MainPresenter
import com.daekyung.mykotlinexample02.presenter.MainPresenterImpl

class MainActivity : AppCompatActivity(), MainPresenter.View {

    lateinit var presenter : MainPresenter.Presenter

    lateinit var activityMainBinding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        presenter = MainPresenterImpl().apply {
            mainView = this@MainActivity
            mainModel = MainModel()
        }


        activityMainBinding.button.setOnClickListener {
            view -> presenter.onClick(view)
        }

    }

    override fun setTitle(title: String) {
        activityMainBinding.textView.text = title
    }
}
