Mosby Mail
Model-View-Presenter library for android
The name of this library, Mosby, has been chosen in honor of Ted Mosby, the architect of the famous tv series How I Met Your Mother. The aim of this library is to help you build modern android apps with a clean Model-View-Presenter architecture. Furthermore, Mosby helps you to handle screen orientation changes by introducing ViewState and retaining Presenters.

It’s a library, not a framework

At first glance Mosby looks a lot like a framework. There are some classes like MvpFragment you can extends from, but the point is that you don’t have to if you don’t want to. At it’s core Mosby is a tiny library based on delegation. So you don’t have to use MvpFragment if you don’t want to. You can use delegation and composition to integrate Mosby in your own development stack. Hence you are not caught into a frameworks boundaries and limits.

Getting started

In the getting started section you will find some simple examples how to use Mosby to build MVP based screens. Mosby also supports Kotlin and you will find there a simple Kotlin example as well. If you are looking for a real app powered by Mosby, you should have a look at the First App section where you will find a complex E-Mail client app.

Dependencies

Mosby is divided in modules. You can pick those modules you need from the following list of dependencies:

dependencies {
	compile 'com.hannesdorfmann.mosby:mvp:2.0.0'
	compile 'com.hannesdorfmann.mosby:viewstate:2.0.0'
}
Migration to Mosby 2.0

With Mosby 2.0 all third party dependencies and libraries like Butterknife and FragmentArgs has been removed. That also means that many modules from Mosby 1.0 has been removed as well like core (including MosbyActivity and MosbyFragment), dagger1 modules, retrofit and rx. The reason is that third party dependencies bring a lot of problems and they shouldn’t never be part of Mosby. A concrete example was Butterknife integration in Mosby. Mosby 1.1.0 used Butterknife 6 with Butterknife.inject() used in MosbyActivity. Then Butterknife 7 was released with breaking API changes like Butterknife.bind() was introduced to replace Butterknife.inject(). So we had migrate Mosby to Butterknife 7 and released Mosby 1.2.0. The problem was that every app out there using Mosby had to migrate the whole app to Butterknife 7 as well in order to upgrade to Mosby 1.2.0 and any future Mosby release that may containing bugfixes and improvements. That can happen with any third party library at any time like upgrading from retrofit 1.9.0 to retrofit 2.0.0. That’s the reason why we have removed all third party libraries and Mosby modules depending on them other developers may have find useful like dagger1 integration. We recommend you (or your team) to build such “base classes” for each app so you can decide per app which third party libraries you want to use and when to upgrade these libraries to a newer available version. You can checkout the v1.x branch and copy manually those classes your need into your apps repository. We apologize for any inconvenience this may cause but we are sure that this help us to avoid problems in the future and to focus on the fact that Mosby is a MVP library and not a bloated framework.

Questions

Almost all pages on this site provide a Disqus section at the end of the page. Don’t hesitate to ask question about the pages content directly in the Disqus section. However, please use the issue tracker on GitHub to report bugs, issues or start conceptional design discussions. The changelog can be found in the release section on Github.

Contributing

If you would like to contribute code you can do so through GitHub by forking the repository and sending a pull request. When submitting code, please make every effort to follow existing conventions and style in order to keep the code as readable as possible.

Mosby Comments:
1, mainly use com.hannesdorfmann.mosby.mvp.lce.MvpLceView, com.hannesdorfmann.mosby.mvp.MvpBasePresenter, com.hannesdorfmann.mosby.mvp.MvpPresenter in BaseRxLcePresenter class
2, use com.hannesdorfmann.mosby.mvp.MvpPresenter, com.hannesdorfmann.mosby.mvp.MvpView, com.hannesdorfmann.mosby.mvp.viewstate.MvpViewStateActivity in BaseViewStateActivity class
3, com.hannesdorfmann.mosby.mvp.viewstate.MvpViewStateFragment in BaseViewStateFragment class
4, com.hannesdorfmann.mosby.mvp.viewstate.ViewState, com.hannesdorfmann.mosby.mvp.viewstate.layout.MvpViewStateLinearLayout in LabelLayout class