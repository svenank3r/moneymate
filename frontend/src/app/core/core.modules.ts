import {NavigationModule} from './navigation/navigation.module';
import {MainNavigationComponent} from './navigation/components/main-navigation/main-navigation.component';
import {NotFoundComponent} from './navigation/components/not-found/not-found.component';
import {NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';

@NgModule({
    declarations: [],
    imports: [
        NavigationModule,
        RouterModule,
    ],
    providers: [],
    exports: [
        MainNavigationComponent,
        NotFoundComponent,
    ]
})
export class CoreModule {
}
