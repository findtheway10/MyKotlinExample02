package com.daekyung.mykotlinexample02.presenter

import com.daekyung.mykotlinexample02.model.MainModel

/**
 * Created by computer on 2017. 11. 1..
 */
interface MainPresenter {

    interface View {

        fun setTitle(title :String)
    }

    interface Presenter {

        fun onClick(view :android.view.View)

        var mainModel: MainModel
        var mainView: MainPresenter.View

    }



}