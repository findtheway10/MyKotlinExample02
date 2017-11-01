package com.daekyung.mykotlinexample02.presenter

import android.view.View
import com.daekyung.mykotlinexample02.model.MainModel

/**
 * Created by computer on 2017. 11. 1..
 */
class MainPresenterImpl : MainPresenter.Presenter {

    lateinit override var mainModel: MainModel
    lateinit override var mainView: MainPresenter.View

    override fun onClick(view: View) {

        mainModel.title.let {
            mainView.setTitle(it)
        }
    }


}