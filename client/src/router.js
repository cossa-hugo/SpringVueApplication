import Auth from '@okta/okta-vue'
import Vue from 'vue'
import Todos from './components/Todos'
import Router from "@vue/cli-service/generator/router/template/src/router";

Vue.use(Auth, {
    issuer: 'https://dev-20491712.okta.com/oauth2/default',
    client_id: '0oa64vcbbfsys3Mw95d7',
    redirect_uri: window.location.origin+'/login/callback',
    scope: ["openid", "profile", "email"]
});

Vue.use(Router);

let router = new Router({
    mode: 'history',
    routes: [
        {
            path: '/',
            name: 'Todos',
            component: Todos,
            meta: {
                requiresAuth: true
            }
        },
        {
            path: '/login/callback',
            component: Auth.handleCallback(),
        },
    ]
});

router.beforeEach(Vue.prototype.$auth.authRedirectGuard());

export default router;