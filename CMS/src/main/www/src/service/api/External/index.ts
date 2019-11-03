import axios from 'axios';
import Vue from 'vue';
import Endpoint from "@/service/api/Endpoint";
import {LoginResult} from "@/service/api/External/types";

/**
 * External api controller.
 * ========================
 *
 * Controller for the `/external` api endpoint.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
export default class Index extends Endpoint {
    /**
     * Constructor
     *
     * @param http Axios instance.
     * @param vue  Vue instance.
     */
    constructor(http: typeof axios, vue: typeof Vue) {
        super(http, vue, "/external");
    }

    /**
     * Performs the login operation.
     *
     * @param username Login username.
     * @param password Login password.
     */
    async login(username: string, password: string): Promise<LoginResult> {
        const result = await this.http.post("/login", {
            username: username,
            password: password
        });

        return result.data;
    }
}